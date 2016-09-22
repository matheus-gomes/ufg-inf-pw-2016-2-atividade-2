<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link href="css/bootstrap.css" rel="stylesheet">
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<title>Aluno Aprovado/Reprovado</title>
	</head>
	<body>
		<div class="container">
		<form class="form-horizontal" action="AprovadoReprovado" method="post">
			<fieldset>
				<legend>Resultado aprovação</legend>
				
				<div class="form-group">
      				<label for="nome" class="col-lg-2 control-label">Nome</label>
      				<div class="col-lg-10">
        				<input type="text" class="form-control" id="nome" name="nome" placeholder="Digite o nome do aluno" value="${param.nome}">
      				</div>
    			</div>
    			
    			<div class="form-group">
      				<label for="frequencia" class="col-lg-2 control-label">Frequência</label>
      				<div class="col-lg-10">
        				<input type="text" class="form-control" id="frequencia" name="frequencia" placeholder="Digite a frequência do aluno" value="${param.frequencia}">
      				</div>
    			</div>
    			
    			<div class="form-group">
      				<label for="notaFinal" class="col-lg-2 control-label">Nota Final</label>
      				<div class="col-lg-10">
        				<input type="text" class="form-control" id="notaFinal" name="notaFinal" placeholder="Digite a nota do aluno" value="${param.notaFinal}">
      				</div>
    			</div>
    			
				<div style="float:right;">
					<button class="btn btn-primary btn-lg">Enviar</button>
					<button class="btn btn-default btn-lg" type="reset">Cancelar</button>
				</div>
			</fieldset>
		</form>
		<br>
		<div class="${classeAlerta}">
  			${resultadoFinal}
		</div>
		</div>
		
	</body>
</html>