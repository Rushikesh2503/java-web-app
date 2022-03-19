<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Carts</title>
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
<style>
.img-thumbnail {
	width: 56% !important;
	height: 110px !important;
	margin:auto;
}

</style>
</head>
<body>
	<div>
		<div>
			<jsp:include page="./navbar.jsp"></jsp:include>
		</div>
		<div class="container d-flex justify-content-around border border-dark rounded text-center my-3">
			<h1>Your Shopping Cart</h1>
		</div>
		
    <div class="container">
      <div class="card">
        <table class="table table-image">
          <thead>
            <tr>
              <th scope="col"></th>
              <th scope="col">Product</th>
              <th scope="col">Price</th>
              <th scope="col">Qty</th>
              <th scope="col">Total</th>
              <th scope="col">Actions</th>
            </tr>
          </thead>
          <tbody id="pareTable">
            
          </tbody>
        </table> 
        <div class="d-flex justify-content-end pr-5 py-1 border">
          <h5 class="mr-5">Total: <span class="price text-success mt-1"  id="totalAmt"></span></h5>
          <button type="button" onclick="window.location.href='/payment'" class="btn btn-success" style="text-transform: uppercase;">Checkout</button>
        </div>
      </div>
    </div>
	</div>

<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<script src="https://code.jquery.com/jquery-3.5.1.js"
		integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
		crossorigin="anonymous">
</script>
<script type="text/javascript" src="../assets/js/carts.js"></script>
</body>
</html>