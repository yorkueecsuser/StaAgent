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
    PrintWriter w2 = response.getWriter(); // Mutant: Duplicate assignment
    ServletOutputStream s = response.getOutputStream();
  }

  void bBad(ServletResponse response) throws IOException {
    ServletOutputStream s = response.getOutputStream();
    ServletOutputStream s2 = response.getOutputStream(); // Mutant: Duplicate assignment
    PrintWriter w = response.getWriter();
  }

  void cBad(ServletRequest request, ServletResponse response, RequestDispatcher dispatcher)
      throws IOException, ServletException {
    PrintWriter w = response.getWriter();
    PrintWriter w2 = response.getWriter(); // Mutant: Duplicate assignment
    dispatcher.forward(request, response);
  }

  // A bugfix for cBad.
  void cOk(ServletRequest request, ServletResponse response, RequestDispatcher dispatcher)
      throws IOException, ServletException {
    PrintWriter w = response.getWriter();
    w.flush();
    PrintWriter w2 = response.getWriter(); // Mutant: Duplicate assignment
    dispatcher.forward(request, response);
  }
}