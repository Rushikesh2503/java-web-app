var userD;
var prodM;
var amt;
$(document).ready(function() {
	console.log("STARTED");
	userD = localStorage.getItem('userData');
	userD = JSON.parse(userD);
	let user_id = userD.user_id;
	let url = "http://localhost:8050/prod/cart/view?query=" + user_id + "";
	console.log(userD, "USER", url)
	$.ajax({
		url: url,
		type: 'GET',
		dataType: 'json', // added data type
		success: function(res) {
			console.log(res, "RES");
			appen(res);
		}
	});

});

function appen(res) {
	amt = 0;
	for (let d of res) {
		$('#pareTable').append('<tr><td class="w-25 text-center"><img src="' + d.prod_pic + '" class="img-fluid img-thumbnail" alt="Sheep"></td><td>' + d.prod_name + '</td><td>' + d.prize + '</td><td class="qty">1</td><td>' + d.prize + '</td><td><button class="btn btn-danger btn-sm" onclick="deleteProd(' + d.product_id + ')"><i class="fa fa-times"></i></button></td></tr>')
		//console.log("DP",parseInt(d.prize.split("$")[1]))
		amt += parseInt(d.prize.split("$")[1])
	}
	$('#totalAmt').text("$ " + amt)
	console.log(amt, "AMT")
}

function deleteProd(pId) {

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
			).then((confirm) => {
				if (confirm) {
					let deleteUrl = "/product/delete?productid=" + pId + "&userid=" + userD.user_id + "";
					console.log("DEL", pId, userD, deleteUrl)
					$.ajax({
						url: deleteUrl,
						type: 'DELETE',
						success: function(result) {
							console.log(result);
							location.reload();
						}
					});
				}
			})


		}
	})


}