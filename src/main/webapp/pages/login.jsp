<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SHOP-7 | Login</title>
	<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
	<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
		<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<script src="https://code.jquery.com/jquery-3.5.1.js"
		integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
		crossorigin="anonymous">
</script>
</head>
<body>
<div class="card mx-auto mt-5 w-25 p-5">
			<div class='text-center'>
			<img alt="shop7" class="w-75 h-50 mx-auto mb-3" src="https://i.ibb.co/6NM0fNs/logoShop.png">
				<!-- <h1 class="text-secondary">LOGIN</h1> -->
				<form id="loginForm" class="mb-4" action="" method="post">
					<div class="form-group">
						<input type="email" class="form-control" name="email"
							placeholder="Enter Email ID" required>
					</div>
					<div class="form-group">
						<input type="password" class="form-control" name="password"
							placeholder="Enter Password" required>
					</div>
					<button type="submit" id="loginInBtn" onclick="loginUser(event)"
						class="btn btn-primary px-5">LOGIN</button>
				</form>
				<div class="d-flex flex-row w-75 mx-auto">Dont have account ? <div role="button" class="text-primary cursor-pointer" onclick="window.location.href='/register'">Click here</div></div>
			</div>
		</div>
		
<script type="text/javascript" src="../assets/js/login.js"></script>
</body>
</html>