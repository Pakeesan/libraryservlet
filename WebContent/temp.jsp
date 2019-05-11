<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"
	integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ"
	crossorigin="anonymous"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"
	integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd"
	crossorigin="anonymous"></script>
<body>
	<form method="post" id="classificationForm">
		<h3>enter classification</h3>
		<br>
		<table border=1>
			<tr>
				<td>ClassificationId</td>
				<td><input type="text" name="classificationId" id="cid"></td>
			</tr>
			<tr>
				<td>ClassificationName</td>
				<td><input type="text" name="classificationName" id="cname"></td>
			</tr>

		</table>
		<input type="submit" value="save classidfication">
	</form>
	
	<script language="javascript" type="text/javascript">
		$(function(){
			$("#classificationForm").submit(function(event){
				event.preventDefault();
				console.log($("#classificationForm").serialize());
				$.ajax({
					url:'classificationservlet',
					type:'post',
					data:$("#classificationForm").serialize(),
					success:function(data){
					alert(data);
				}
				});
			});
		});
	</script>

</body>
<button type="button" class="btn btn-primary" value="save classidfication">Add</button>
</html>