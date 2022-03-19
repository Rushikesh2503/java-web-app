
var comData;
$(document).ready(function() {
	console.log("STARTED");
	$.get("http://localhost:8050/show",
	function(data, status) {
		data = JSON.parse(data);
			comData = data;
			console.log(data)
			for (let i = 0; i < data.length; i++) {
				$("#tbl").append('<tr id="' + data[i].user_id + '"><th scope="row">' + (i + 1) + '</th><td><p>' + data[i].user_name + '</p></td><td><button type="button" class="btn btn-primary text-center"  data-toggle="modal" data-target="#updateModal" onClick="updateData(' + data[i].user_id + ')">UPDATE</button></td><td><button type="button" class="btn btn-danger text-center" onClick="deleteData(' + data[i].user_id + ')">DELETE</button></td></tr>');
			}
		});
});


function subfn(e) {
	e.preventDefault();
	var data = $('#form').serializeArray().reduce(function(obj, item) {
		obj[item.name] = item.value;
		return obj;
	}, {});
	console.log("Data1: " + data);
	$.post("http://localhost:8050/add",
		data,
		function(data, status) {
			swal.fire({
				html: `<div class = "d-flex flex-column"><h3 class="f-32 font-weight-bold">Success</h3><div class="greyish-brown f-22 mt-2">Sign Up Successfully</div></div>`,
				closeOnConfirm: false,
				closeOnCancel: false,
				allowOutsideClick: false,
				allowEnterKey: false,
				allowEscapeKey: false,
				showCloseButton: false,
				showCancelButton: false,
				showConfirmButton: true,
				reverseButtons: true,
				confirmButtonText: "OK",
				icon: "success",
				buttonsStyling: false,
				customClass: {
					content: 'p-0',
					confirmButton: "btn btn-primary",
					cancelButton: "btn btn-secondary"
				},
			}).then(() =>
				window.location.href = "http://localhost:8050/"
			);
		});
}

function updateData(id) {
	let userD = (comData.filter((e) => e.user_id == id))[0];

	console.log("users", userD);
	$('#name_user').val(userD.user_name);

	$('#updateModal').show();
	$('#update_name_user').on("click", function() {
		let name = $('#name_user').val();

		userD.user_name = name;
		userD.user_id = id;
		console.log("OBJ", userD)

		$.post("http://localhost:8050/update",
			userD,
			function(data, status) {
				Swal.fire(
					'User Updated',
					'User Updated Successfully!',
					'success'
				).then(() =>
					location.reload()
				);
			});
		//console.log("n",n)
		$('#updateModal').hide();
		$('body').removeClass('modal-open');
		$('.modal-backdrop').remove();
	})
}

function deleteData(id) {
	Swal.fire({
		title: 'Are you sure?',
		text: "You won't be able to revert this!",
		icon: 'warning',
		showCancelButton: true,
		confirmButtonColor: '#3085d6',
		cancelButtonColor: '#d33',
		confirmButtonText: 'Yes, delete it!'
	}).then((result) => {
		if (result.isConfirmed) {
			Swal.fire(
				'Deleted!',
				'Your file has been deleted.',
				'success'
			).then(() =>
				$.post("http://localhost:8050/delete",
					{
						user_id: id
					},
					function(data, status) {
						location.reload();
					}
				)
			)
		}
	})


}