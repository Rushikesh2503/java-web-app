<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PAYMENT PAGE</title>
<link rel="icon"
	href="https://i.pinimg.com/originals/a4/7d/12/a47d1260b6477d8d4d0c2952cbe785ef.jpg"
	type="image/icon type">

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="container-lg text-center mt-5">
	<div class="panel panel-primary w-50 m-auto">
  <div class="panel-heading">
      <h3 class="panel-title">Payment using Debit/ Credit</h3>
  </div>
  <form class="panel-body" action="your-form-handling-page" method="POST" id="checkout-form" onsubmit="return do_when_clicking_submit_button()">
    <div class="row">
       
      <div class="form-group col-md-12">
          <label for="cardholder-name"></label>
          <input type="text" class="form-control" id="cardholder-name" placeholder="Cardholder Name">
          <span class="helper-text"></span>
       </div>
       <!--Hosted Payment Field for CC number-->
       <div class="form-group col-9">
          <input type="text" class="form-control" id="card-number" placeholder="Card Number">
         <span class="helper-text" id="card-help"></span>
       </div>
			 <!--Hosted Payment Field for CC CVV-->
			<div class="form-group col-3">
         <input type="text" class="form-control" id="cvv" placeholder="CVV">
         <span class="helper-text" id="cvv-help"></span>
      </div>
    
    <!--Hosted Payment Field for CC EXP-->
       <div class="form-group col-6">
          <input type="text" class="form-control" id="exp_date" placeholder="EXP(mm/yyyy)">
          <span class="helper-text" id="exp-help"></span>
       </div>
		  <div class="form-group col-6">
          <input type="text" class="form-control" id="postal_code" placeholder="Postal Code">
          <span class="helper-text"></span>
       </div>	
    </div>
    
		<button class="btn btn-raised btn-info btn-lg col-md-4" type="submit" id="submit-button">Pay Now</button>
    
		</form>
  
</div>


</div>

<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<script src="https://code.jquery.com/jquery-3.5.1.js"
		integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
		crossorigin="anonymous">
</script>
<script>
var userD;
var user_id;
$(document).ready(function() {
		console.log("STARTED");
		userD = localStorage.getItem('userData');
		userD = JSON.parse(userD);
		user_id=userD.user_id;
});

$('#submit-button').on("click",function (e){
	e.preventDefault();
	swal.fire({
		html: `<div class = "d-flex flex-column"><h3 class="f-32 font-weight-bold">Done</h3><div class="greyish-brown f-22 mt-2">Payment Done Successfully</div></div>`,
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
	}).then((confirm) => {
			let deleteUrl="/product/user/cart?userid="+user_id+"";
			console.log("DEL",deleteUrl)
			 $.ajax({
			    url: deleteUrl,
			    type: 'DELETE',
			    success: function(result) {
			    	
			    }
			}); 
			window.location.href="http://localhost:8050/home";
	});
});




</script>
</body>
</html>