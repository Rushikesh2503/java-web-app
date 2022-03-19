var comData;
$(document).ready(function() {
	console.log("STARTED");
});

function loginUser(e) {
	e.preventDefault();
	var data = $('#loginForm').serializeArray().reduce(function(obj, item) {
		obj[item.name] = item.value;
		return obj;
	}, {});
	//console.log(data,"data");
	$.post("http://localhost:8050/user/login",
		data,
		function(data, status) {
			if (data != "[]") {
				comData = JSON.parse(data)[0];
				console.log("data", comData);
				localStorage.setItem('userData', JSON.stringify(comData));
				Swal.fire({
					html: `<div class = "d-flex flex-column"><h3 class="f-32 font-weight-bold">Success</h3><div class="greyish-brown f-22 mt-2">Login Successfully</div></div>`,
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
				}).then(() => {
					window.location.href = "http://localhost:8050/home";

				})
			}
		});
}