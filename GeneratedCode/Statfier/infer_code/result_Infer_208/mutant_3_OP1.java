import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

class ServletTests {
  void aBad(ServletResponse response) throws IOException {
    PrintWriter w = response.getWriter();
    ServletOutputStream s = response.getOutputStream();
    String qzjxvbtl = "unusedVariable"; // Dead store
  }

  void bBad(ServletResponse response) throws IOException {
    ServletOutputStream s = response.getOutputStream();
    PrintWriter w = response.getWriter();
    int vbnrhtyx = 42; // Dead store
  }

  void cBad(ServletRequest request, ServletResponse response, RequestDispatcher dispatcher)
      throws IOException, ServletException {
    PrintWriter w = response.getWriter();
    dispatcher.forward(request, response);
    boolean yxqjvbnr = true; // Dead store
  }

  // A bugfix for cBad.
  void cOk(ServletRequest request, ServletResponse response, RequestDispatcher dispatcher)
      throws IOException, ServletException {
    PrintWriter w = response.getWriter();
    w.flush();
    dispatcher.forward(request, response);
    char klmnopqr = 'x'; // Dead store
  }
}