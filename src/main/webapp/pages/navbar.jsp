<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">
	
<title>nav</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" style="font-family: fantasy;font-size: 22px" href="/home">SHOP 7</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/home">Home<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/men">Men</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/women">Women</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/carts">Cart</a>
      </li>
    </ul>
    <div class="d-flex justify-content-end">
    	<div class="mt-1 mr-3 text-light" id="profileName" style="font-family:monospace;font-size: 18px; text-transform: uppercase;"></div>
        <button class="btn btn-light btn-sm" onclick="logoutfn()"><i class="fa fa-sign-out"></i></button>
      </div>
  </div>
</nav>
<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	<script src="https://code.jquery.com/jquery-3.5.1.js"
		integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
		crossorigin="anonymous"></script>
	<script>
	var userD;
		$(document).ready(function() {
			
			userD = localStorage.getItem('userData');
			userD = JSON.parse(userD);
			console.log(userD);
			let userName=userD.user_name;
			$('#profileName').text(userName);
		})
		function logoutfn(){
			localStorage.clear();
			window.location.href="http://localhost:8050/";
		}
</script>
</body>
<script src="https://kit.fontawesome.com/2194019d5d.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</html>