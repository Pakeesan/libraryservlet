<script language="javascript" type="text/javascript">
		$(function(){
			$("#classificationForm").submit(function(event){
				event.preventDefault();
				console.log($("#classificationForm").serialize());
				$ajax({
					url:'classificationservlet',
					type:'post',
					data:$("#classificationForm").serialize(),
					success:function(data)
					alert(data);
				}
				});
			});
		});
	</script>