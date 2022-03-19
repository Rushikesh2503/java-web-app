<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SHOP-7 | HOME</title>
<link rel="icon" href="https://i.pinimg.com/originals/a4/7d/12/a47d1260b6477d8d4d0c2952cbe785ef.jpg" type="image/icon type">

	<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
	<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
		<style>
			.bg_caro{
				background-color: rgba(0,0,0,0.5) !important;
			}
			.cursor-pointer {
  cursor: pointer;
}
		
		</style>
</head>
<body>
<div>
	<div>
		<jsp:include page="./navbar.jsp"></jsp:include>
	</div>
	
	
	<div class="card my-0">
		<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active "  onclick="window.location.href='/offers'">
      <img class="d-block w-100" src="https://images.unsplash.com/photo-1555529771-122e5d9f2341?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&h=400" alt="First slide">
    	<div class="carousel-caption cursor-pointer d-none d-md-block bg_caro">
    		<h3>OFFERS ZONE</h3>
    		<p>Sale 50% off for you </p>
  		</div>
    </div>
    <div class="carousel-item" onclick="window.location.href='/women'">
      <img class="d-block w-100" src="https://images.unsplash.com/photo-1483985988355-763728e1935b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&h=400" alt="Second slide">
    	<div class="carousel-caption cursor-pointer d-none d-md-block bg_caro">
    		<h3>WOMEN ZONE</h3>
    		<p>All Collections for Women</p>
  		</div>
    </div>
    <div class="carousel-item" onclick="window.location.href='/men'">
      <img class="d-block w-100" src="https://images.unsplash.com/photo-1555529669-e69e7aa0ba9a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&h=400" alt="Third slide">
    	<div class="carousel-caption cursor-pointer d-none d-md-block w-50 bg_caro mx-auto text-white">
    		<h3>MEN ZONE</h3>
    		<p>All Collections for Men</p>
  		</div>
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
	
	</div>
	
	
	<div  class="card mx-auto text-center my-5">
		<jsp:include page="./cards.jsp"></jsp:include>
	</div>

</div>
</body>
</html>