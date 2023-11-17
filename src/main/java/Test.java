import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/testing")
public class Test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Done");

        String name_input = req.getParameter("name_input");
        System.out.println(name_input);

        PrintWriter writer = resp.getWriter();
        writer.println("<h1> Hello, " + name_input + "!</h1>");

        writer.println(" <form method=\"get\" action=\"index.html\">\n" +
                "        <button type=\"submit\">Go Back</button>\n" +
                "    </form> ");
    }
}
