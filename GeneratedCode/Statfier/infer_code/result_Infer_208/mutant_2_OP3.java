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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      w.println("This is unreachable");
    }
  }

  void bBad(ServletResponse response) throws IOException {
    ServletOutputStream s = response.getOutputStream();
    PrintWriter w = response.getWriter();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      s.write("This is unreachable".getBytes());
    }
  }

  void cBad(ServletRequest request, ServletResponse response, RequestDispatcher dispatcher)
      throws IOException, ServletException {
    PrintWriter w = response.getWriter();
    dispatcher.forward(request, response);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      w.println("This is unreachable");
    }
  }

  // A bugfix for cBad.
  void cOk(ServletRequest request, ServletResponse response, RequestDispatcher dispatcher)
      throws IOException, ServletException {
    PrintWriter w = response.getWriter();
    w.flush();
    dispatcher.forward(request, response);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      w.println("This is unreachable");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if block unreachable
  }
}