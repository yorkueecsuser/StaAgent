import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class Bug3432911 {
  @DesireNoWarning("OS_OPEN_STREAM")
  @NoWarning("OBL_UNSATISFIED_OBLIGATION")
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    InputStream msgInputStream = null;
    BufferedReader r = null;
    InputStreamReader isr = null;
    try {
      msgInputStream = request.getInputStream();
      isr = new InputStreamReader(msgInputStream);
      r = new BufferedReader(isr);
      
      // Mutant code: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() always returns false
        System.out.println("This is an unreachable block");
      } else {
        // This block will always execute
        System.out.println("This is the reachable block");
      }
    } catch (Exception ex) {

    }
  }

  @NoWarning("OS_OPEN_STREAM,OBL_UNSATISFIED_OBLIGATION")
  protected void doGet3(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    InputStream msgInputStream = null;
    try {
      msgInputStream = request.getInputStream();
      int b = msgInputStream.read();
      System.out.println(b);
      
      // Mutant code: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() always returns false
        System.out.println("This is an unreachable block");
      } else {
        // This block will always execute
        System.out.println("This is the reachable block");
      }
    } catch (Exception ex) {

    }
  }

  @NoWarning("OS_OPEN_STREAM,OBL_UNSATISFIED_OBLIGATION")
  protected void doGet2(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    InputStream msgInputStream = null;
    BufferedReader r = null;
    InputStreamReader isr = null;
    try {
      msgInputStream = request.getInputStream();
      isr = new InputStreamReader(msgInputStream);
      r = new BufferedReader(isr);
      
      // Mutant code: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() always returns false
        System.out.println("This is an unreachable block");
      } else {
        // This block will always execute
        System.out.println("This is the reachable block");
      }
    } catch (Exception ex) {

    } finally {
      if (msgInputStream!= null) msgInputStream.close();
      if (isr!= null) isr.close();
      if (r!= null) r.close();
    }
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}