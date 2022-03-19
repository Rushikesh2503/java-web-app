
$(document).ready(function() {

	console.log("APP STARTED");

	/*$.get("http://localhost:8050/data/datatable/get",
		function(data, status) {
			data = JSON.parse(data);
			console.log(data);
		});*/
	/*$.post("http://localhost:8050/datatable/add",
		function(data, status) {
			data = JSON.parse(data);
			console.log(data);
		});*/
		KTDatatablesBasicBasic();

});

//my_datatable-kt_datatable
var table;
function KTDatatablesBasicBasic() {

	table = $('#my_datatable').DataTable({
		serverSide: true,
		paging:true,
		ajax: {
			url: "http://localhost:8050/datatable/add",
			type: 'POST',
			contentType: "application/json",
			data: function(d) {
				console.log(d,"D")
				return JSON.stringify(d);
			},
			dataFilter: function(data) {
				
				let return_data = JSON.parse(data);
				console.log(return_data,"DATAFILTER")
				return JSON.stringify(return_data);
			}
		},
		responsive: true,
		pagingType: "full_numbers",
		scrollX: true,
		dom: '<"row"<"col-sm-5"B><"col-sm-7"fr>>t<"row"<"col-sm-5"i><"col-sm-7"p>>',
		pageLength: 10,
		lengthMenu: [5, 10, 25, 50],
		language: {
			processing: '<i class="fa fa-spinner fa-spin fa-3x fa-fw"></i><span class="sr-only">Loading...</span> ',
			emptyTable:
				'<div class="row align-items-center m-0 h-100 " style="min-height: 464px;" id="data_not_found">' +
				'<div class="col-md-12 p-0 text-center">' +
				'<img src="/resources/no_product_data.svg" alt="no data" class="pb-25 pt-25">' +
				'<div class="f-20 fw-500 brownish-grey pb-15">No data yet</div>' +
				'<div class="f-14 brown-grey"></div> </div> </div>',
		},
		order: [[0, 'asc']],
		buttons: [],
		ordering: true,
		searching: true,
		columnDefs: [
			{
				orderable: true,
				targets: 0,
				render: function(data, type, row) {
					return data;
				}
			},{
				orderable: true,
				targets: 1,
				render: function(data, type, row) {
					return data;
				}
			},{
				orderable: true,
				targets: 2,
				render: function(data, type, row) {
					return data;
				}
			},{
				orderable: true,
				targets: 3,
				render: function(data, type, row) {
					return data;
				}
			},{
				orderable: true,
				targets: 4,
				render: function(data, type, row) {
					return data;
				}
			}
		]
	}).on('draw', function() {
		$('[data-toggle="tooltip"]').tooltip();
	});
}


