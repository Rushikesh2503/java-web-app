var userD;
var prodM;
$(document).ready(function() {
	console.log("STARTED");
	userD = localStorage.getItem('userData');
	userD = JSON.parse(userD);
	console.log(userD, "USER")
	$.ajax({
		url: "http://localhost:8050/product/women",
		type: 'GET',
		dataType: 'json', // added data type
		success: function(res) {
			//console.log(res,"RES");
			prodM = res;
			appends(res);
		}
	});

});

function searchData(e){
	let txt=$('#searchVal').val();
	e.preventDefault();
		$.ajax({
		url: "http://localhost:8050/product/womens?search="+txt,
		type: 'GET',
		dataType: 'json', // added data type
		success: function(res) {
		//console.log(res,"RES");
			prodM = res;
			$('#cateCard').html('');
			appends(res);
		}
	});
}

function appends(res) {
	//console.log("res",res);
	let htm = "";
	for (let d of res) {
		$('#cateCard').append('<div class="col-xs-12 col-md-6 col-lg-4 col-xl-3 col-12 p-3 rounded text-center justify-content-space-around bg-mybg border border-none mt-2 mb-5"><img src="' + d.prod_pic + '" class="img-thumbnail" alt="img"><p class="h5">' + d.prod_name + '</p><p class="h6">' + d.prize + '</p><button class="mybtn bg-dark" onclick="addtoCart(' + d.product_id + ')"><i class="fa fa-plus-square fs-20"></i> ADD TO CART</button></div>');
	}
}

function addtoCart(id) {
	let obj = {}
	let user_id = userD.user_id;
	let newProd = prodM.filter((el) => el.product_id == id)[0]
	console.log(id, "Id", newProd);
	obj = { ...newProd, user_id: user_id }
	$.post("http://localhost:8050/prod/cart",
		obj,
		function(data, status) {
			console.log("DPOST", data)
			if (data == "success") {
				swal.fire({
					html: `<div class = "d-flex flex-column"><h3 class="f-32 font-weight-bold">Done</h3><div class="greyish-brown f-22 mt-2">Product Added Successfully</div></div>`,
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
				})
			} else {

				swal.fire({
					html: "<div class='d-flex flex-column'><h3 class='f-32 font-weight-bold'>Already Added</h3><div class='greyish-brown f-22 mt-2'>" + data + "</div></div>",
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
					icon: "warning",
					buttonsStyling: false,
					customClass: {
						content: 'p-0',
						confirmButton: "btn btn-primary",
						cancelButton: "btn btn-secondary"
					},
				})
			}
		});
}