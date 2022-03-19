<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DataTable</title>
	<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
crossorigin="anonymous"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/sweetalert2@7.12.15/dist/sweetalert2.all.min.js"></script>
	<link rel='stylesheet'
		href='https://cdn.jsdelivr.net/npm/sweetalert2@7.12.15/dist/sweetalert2.min.css'></link>
		<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.4/css/jquery.dataTables.min.css"/>
 
</head>
<body>
	<div>
		<div class="card card-custom gutter-b">
									<!--begin::Card-Body-->
									<div class="card-body pt-0">
										<!--begin: Datatable-->
										<table
											class="table table-striped table-bordered table-checkable" style="width:100%;"
											id="my_datatable">
											<thead>
												<tr>
													<th class="cursor-pointer">Name</th>
													<th class="cursor-pointer">Department</th>
													<th class="cursor-pointer">PRICE</th>
													<th class="cursor-pointer">Created At</th>
													<th class="cursor-pointer">Updated At</th>
													<th class="cursor-pointer">IsActive</th>
												</tr>
											</thead>
											<tbody></tbody>
										</table>
										<!--end: Datatable-->
									</div>
									<!--end::Card-Body-->
								</div>
	</div>




	<script type="text/javascript" src="/assets/datatable.js"></script>
	<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.11.4/datatables.min.js"></script>
</body>
</html>