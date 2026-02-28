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
    String qjxvbnrt = "unusedVariable"; // Dead Store mutation
  }

  void bBad(ServletResponse response) throws IOException {
    ServletOutputStream s = response.getOutputStream();
    PrintWriter w = response.getWriter();
    int ztymnkhg = 42; // Dead Store mutation
  }

  void cBad(ServletRequest request, ServletResponse response, RequestDispatcher dispatcher)
      throws IOException, ServletException {
    PrintWriter w = response.getWriter();
    dispatcher.forward(request, response);
    boolean lmnopqrs = true; // Dead Store mutation
  }

  // A bugfix for cBad.
  void cOk(ServletRequest request, ServletResponse response, RequestDispatcher dispatcher)
      throws IOException, ServletException {
    PrintWriter w = response.getWriter();
    w.flush();
    dispatcher.forward(request, response);
    double abcdwxyz = 3.14; // Dead Store mutation
  }
}