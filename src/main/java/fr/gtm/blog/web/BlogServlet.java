package fr.gtm.blog.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BlogServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * Point d'entr�e de la requ�te HTTP envoy�e par le client (navigateur).
	 */
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// R�cup�ration d'un objet permettant d'�crire dans la r�ponse renvoy�e
		// au client.
		final PrintWriter writer = response.getWriter();
		// Ecriture de cha�nes de caract�res dans le buffer d'un flux
		// repr�sentant le corps de la r�ponse HTTP.
		writer.append("<html>");
		writer.append("<body>");
		writer.append("<h1>HelloWorld servlet !!</h1>");
		writer.append("</body>");
		writer.append("</html>");
		writer.flush();
	}
}
