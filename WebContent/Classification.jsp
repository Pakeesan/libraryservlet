<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="refracsement/dasdborad.jsp"%>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"
	integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ"
	crossorigin="anonymous"></script>
<button type="button" class="btn btn-primary" data-toggle="modal"
	data-target="#exampleModal">AddClassification</button>
<table class="table table-striped">
	<thead>
		<tr>
			<th scope="col">Id</th>
			<th scope="col">Name</th>
			<th scope="col">Edit</th>
			<th scope="col">Delite</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th scope="row">1</th>
			<td>Maths</td>
			<td><button type="button" class="btn btn-primary">Edit</button></td>
			<td><button type="button" class="btn btn-danger">delete</button></td>
		</tr>
		<tr>
			<th scope="row">2</th>
			<td>Sciene</td>
			<td><button type="button" class="btn btn-primary">Edit</button></td>
			<td><button type="button" class="btn btn-danger">delete</button></td>
		</tr>
		<tr>
			<th scope="row">3</th>
			<td>tamil</td>
			<td><button type="button" class="btn btn-primary">Edit</button></td>
			<td><button type="button" class="btn btn-danger">delete</button></td>
		</tr>
	</tbody>
</table>
</div>
<!-- Button trigger modal -->


<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel">classification
					Add</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
				<form method="post" id="classificationForm">
					<div class="form-group">
						<label for="formGroupExampleInput">classification ID:</label> <input
							type="text" class="form-control" id="formGroupExampleInput"
							name="classificationId" placeholder="classification ID">
					</div>
					<div class="form-group">
						<label for="formGroupExampleInput">classification name:</label> <input
							type="text" class="form-control" id="formGroupExampleInput"
							placeholder="classification Name" name="classificationName">
					</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
				<input type="submit" value="save classidfication">

			</div>
			</form>
		</div>
	</div>
</div>
<script language="javascript" type="text/javascript">
	$(function() {
		$("#classificationForm").submit(function(event) {
			event.preventDefault();
			console.log($("#classificationForm").serialize());
			$.ajax({
				url : 'classificationservlet',
				type : 'post',
				data : $("#classificationForm").serialize(),
				success : function(data) {
					alert(data)
				}
			});
		});
	});
</script>
<%@ include file="refracsement/footer.jsp"%>