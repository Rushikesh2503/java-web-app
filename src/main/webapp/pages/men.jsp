<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MEN</title>
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
	width: 95% !important;
	height: 250px !important;
}
*, ::after, ::before {
    box-sizing: content-box !important;
}
.mybtn{
    padding: 5px 20px;
    color: white;
    border: 2px solid ;
    border-radius: 5px;
}
.mybtn:hover{
	transform: scale(1.2);
}
.bg-mybg {
    background-color: #949ca4!important;
}

</style>
</head>
<body>
	<div>
		<div>
			<jsp:include page="./navbar.jsp"></jsp:include>
		</div>
		<div class="container border border-dark d-flex justify-content-around rounded text-center my-3 bg-mybg">
			<h1 style="font-family:verdana;">MEN's Collections</h1>
			<div class="h-50">
				<div class="d-flex">
					<input id="searchVal" class="form-control m-2" type="search"
						placeholder="Search here .." aria-label="Search"
						style="height: 20px">
					<button onclick="searchData(event)"
						class="btn mybtn bg-dark m-2 text-white border border-white rounded"
						style="height: 20px">Search</button>
				</div>
			</div>
		</div>
		<div class="card w-100 border border-none mx-auto my-2" >
			<section class="section-products">
				<div class="container">
					<div class="row justify-content-center text-center">
						<div class="col-md-8 col-lg-6">
							<div class="header py-2">
								<h2 style="text-transform: uppercase;">Popular Products</h2>
							</div>
						</div>
					</div>
					<div id="cateCard" class="d-flex justify-content-around flex-wrap"></div>
				</div>
			</section>

		</div>
	</div>

	<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	<script src="https://code.jquery.com/jquery-3.5.1.js"
		integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
		crossorigin="anonymous">
</script>
<script type="text/javascript" src="../assets/js/men.js"></script>
</body>
</html>