package br.com.feitosa.exemplo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		if (nome == null) {
			nome="";
		}
		
		response.setContentType("text/html;charset=ISO-8859-1");
		String html = "<html>" +
						"<head><title> Titulo da pagina do lado servlet</title></head>" +
					  "<body>" +
						"Seu nome é: <strong>" + nome +
					  "</body>" +
		              "</html>";
		
		PrintWriter out = response.getWriter();
		out.print(html);
	}

}
