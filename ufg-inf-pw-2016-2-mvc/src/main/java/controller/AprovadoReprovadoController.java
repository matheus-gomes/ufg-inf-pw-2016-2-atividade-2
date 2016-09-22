package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AprovadoReprovadoModel;

/**
 * Servlet implementation class AprovadoReprovadoController
 */
@WebServlet("/AprovadoReprovado")
public class AprovadoReprovadoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AprovadoReprovadoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		
		String frequenciaStr = request.getParameter("frequencia");
		int frequencia = Integer.parseInt(frequenciaStr);
		
		String notaFinalStr = request.getParameter("notaFinal");
		float notaFinal = Float.parseFloat(notaFinalStr);
		
		String resultado = AprovadoReprovadoModel.verificarAprovacao(nome, frequencia, notaFinal);
		String alerta = AprovadoReprovadoModel.selecionarAlerta(resultado);
		
		request.setAttribute("resultadoFinal", resultado);
		request.setAttribute("classeAlerta", alerta);

		
		String nextJsp = "/resultado.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJsp);
		dispatcher.forward(request, response);
;		
	}

}
