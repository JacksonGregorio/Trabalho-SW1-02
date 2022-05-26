

import java.io.*;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/welcome-servlet")
public class WelcomeServlet extends HttpServlet {

	private static final long serialVersionUID = -1113582265865921787L;
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String n = request.getParameter("username");
        out.print("Bem vindo " + n + "!!");
    }

}  