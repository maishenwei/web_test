import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/morning")
public class ForwardServlet extends HelloServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        super.doGet(req, resp);
    }
}
