<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="refracsement/dasdborad.jsp"%>
<button type="button" class="btn btn-primary" data-toggle="modal"
	data-target="#exampleModal">AddSubClassification</button>
<table class="table table-striped">
	<thead>
		<tr>
			<th scope="col">Id</th>
			<th scope="col">classification</th>
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
				<h5 class="modal-title" id="exampleModalLabel">Subclassification
					Add</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
				<form>
					<div class="form-group">
						<label for="formGroupExampleInput">classification name:</label>

						<div class="dropdown">


							<button class="btn btn-secondary dropdown-toggle" type="button"
								id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true"
								aria-expanded="false">select classification</button>
							<div class="dropdown-menu" aria-labelledby="dropdownMenu2">
								<button class="dropdown-item" type="button">Maths</button>
								<button class="dropdown-item" type="button">Science</button>
								<button class="dropdown-item" type="button">Computer</button>
							</div>
						</div>
					</div>

					<div class="form-group">
						<label for="formGroupExampleInput2">Subclassification:</label> <input
							type="text" class="form-control" id="formGroupExampleInput2"
							placeholder="">
					</div>

				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary">Add</button>
			</div>
		</div>
	</div>
</div>

<%@ include file="refracsement/footer.jsp"%>