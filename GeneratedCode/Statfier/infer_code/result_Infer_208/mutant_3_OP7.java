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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  void bBad(ServletResponse response) throws IOException {
    ServletOutputStream s = response.getOutputStream();
    PrintWriter w = response.getWriter();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  void cBad(ServletRequest request, ServletResponse response, RequestDispatcher dispatcher)
      throws IOException, ServletException {
    PrintWriter w = response.getWriter();
    dispatcher.forward(request, response);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  // A bugfix for cBad.
  void cOk(ServletRequest request, ServletResponse response, RequestDispatcher dispatcher)
      throws IOException, ServletException {
    PrintWriter w = response.getWriter();
    w.flush();
    dispatcher.forward(request, response);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, but the condition is dynamically determined at runtime
  }
}