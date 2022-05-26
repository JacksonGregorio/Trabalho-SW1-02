// <!-- Jackson de Lima Gregório CB:3013189 e Pedro Henrique Maia CB:3013197" --> //

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class Login extends HttpServlet {
private static final long serialVersionUID = -1113582265865921787L;


    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String n = request.getParameter("username");
        String p = request.getParameter("userpass");

        if (p.equals("servlet")) {
            RequestDispatcher rd = request.getRequestDispatcher("/welcome-servlet");
            rd.forward(request, response);
        } else {
            out.print("Senha errada!");
            RequestDispatcher rd = request.getRequestDispatcher("/index.html");
            rd.include(request, response);

        }
    }

}  
