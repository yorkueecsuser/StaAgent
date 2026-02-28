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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in aBad");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in aBad");
    }
  }

  void bBad(ServletResponse response) throws IOException {
    ServletOutputStream s = response.getOutputStream();
    PrintWriter w = response.getWriter();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in bBad");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in bBad");
    }
  }

  void cBad(ServletRequest request, ServletResponse response, RequestDispatcher dispatcher)
      throws IOException, ServletException {
    PrintWriter w = response.getWriter();
    dispatcher.forward(request, response);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in cBad");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in cBad");
    }
  }

  // A bugfix for cBad.
  void cOk(ServletRequest request, ServletResponse response, RequestDispatcher dispatcher)
      throws IOException, ServletException {
    PrintWriter w = response.getWriter();
    w.flush();
    dispatcher.forward(request, response);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in cOk");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in cOk");
    }
  }

  private boolean getCondition() {
    // This method should return a condition that is dynamically determined at runtime
    return false; // This is just a placeholder, in real scenarios it should be dynamic
  }
}