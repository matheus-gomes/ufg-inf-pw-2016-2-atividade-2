package model;

public class AprovadoReprovadoModel {
	
	public static String verificarAprovacao(String nome, int frequencia, float notaFinal){
		String resultado;
		
		if(frequencia >= 75 && notaFinal >= 6.0) {
			resultado =  "O aluno " + nome + " foi aprovado!";
		} else {
			resultado =  "O aluno " + nome + " foi reprovado!";
		}
		
		return resultado;
	}
	
	public static String selecionarAlerta(String resultado){
		String alerta;
		
		if(resultado.contains("aprovado"))
			alerta = "alert alert-dismissible alert-success";
		else
			alerta = "alert alert-dismissible alert-danger";
		
		return alerta;
	}
}
