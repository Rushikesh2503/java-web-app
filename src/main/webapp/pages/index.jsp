<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="css/signup-style.css">
	<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">
	<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/sweetalert2@7.12.15/dist/sweetalert2.all.min.js"></script>
	<link rel='stylesheet'
		href='https://cdn.jsdelivr.net/npm/sweetalert2@7.12.15/dist/sweetalert2.min.css'></link>

<title>SHOP-7 | SIGNIN</title>
<style>
	.swal2-icon-show{
		font-size: 25px !important;
	}

</style>
</head>
<body>
	<div class="w-50 mx-auto"> 
		<div class="card mx-auto mt-5 w-50 p-5">
			<div class='text-center'>
				<img alt="shop7" class="w-75 h-50 mx-auto mb-3" src="https://i.ibb.co/6NM0fNs/logoShop.png">
				<!-- <h3 class="text-secondary">REGISTER</h3> -->
				<form id="form" action="" method="post">
					<div class="form-group">
						<input type="text" class="form-control" name="user_name"
							placeholder="Enter Name" required>
					</div>
					<div class="form-group">
						<input type="email" class="form-control" name="email"
							placeholder="Enter Email ID" required>
					</div>
					<!-- <div class="form-group">
					<input type="number" class="form-control" name="mobilenumber"
						placeholder="Enter Mobile Number" required>
				</div> -->
					<div class="form-group">
						<input type="password" class="form-control" name="password"
							placeholder="Enter Password" required>
					</div>
					<button type="submit" id="signInBtn" onclick="subfn(event)"
						class="btn btn-primary">Sign Up</button>
				</form>
				<div class="d-flex flex-row ml-3 mt-3">Already have account ? <div role="button" class="text-primary cursor-pointer" onclick="window.location.href='/'">Click here</div></div>
			</div>
		</div>
<!-- 		 <div class="card mx-auto w-50 mt-5 mb-0"> -->
<!-- 			<table class="table table-striped"> -->
<!-- 				<thead class="thead-dark"> -->
<!-- 					<tr class="col-12"> -->
<!-- 						<th class="col-2">SR.NO.</th> -->
<!-- 						<th class="col-6">NAME</th> -->
<!-- 						<th class="col-2"></th> -->
<!-- 						<th class="col-2"></th> -->
<!-- 					</tr> -->
<!-- 				</thead> -->
<!-- 				<tbody id="tbl"> -->

<!-- 				</tbody> -->
<!-- 			</table> -->
<!-- 		</div>  -->
		<div class="modal fade" id="updateModal" tabindex="-1" role="dialog"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalLabel">Update User</h5>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						<form>
							<div class="form-group">
								<label for="recipient-name" class="col-form-label">Name</label>
								<input type="text" class="form-control" id="name_user">
							</div>
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
						<button type="button" class="btn btn-primary"
							id="update_name_user">Update</button>
					</div>
				</div>
			</div>
		</div>
	</div>



	<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	<script src="https://code.jquery.com/jquery-3.5.1.js"
		integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
		crossorigin="anonymous"></script>
		<script type="text/javascript" src="../assets/js/index.js"></script>
</body>
</html>
