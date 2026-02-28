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
      msgInputStream = request.getInputStream(); // Mutant: duplicated assignment
      isr = new InputStreamReader(msgInputStream);
      isr = new InputStreamReader(msgInputStream); // Mutant: duplicated assignment
      r = new BufferedReader(isr);
      r = new BufferedReader(isr); // Mutant: duplicated assignment
    } catch (Exception ex) {

    }
  }

  @NoWarning("OS_OPEN_STREAM,OBL_UNSATISFIED_OBLIGATION")
  protected void doGet3(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    InputStream msgInputStream = null;
    try {
      msgInputStream = request.getInputStream();
      msgInputStream = request.getInputStream(); // Mutant: duplicated assignment
      int b = msgInputStream.read();
      int b2 = msgInputStream.read(); // Mutant: duplicated assignment
      System.out.println(b);
      System.out.println(b2); // Mutant: duplicated assignment
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
      msgInputStream = request.getInputStream(); // Mutant: duplicated assignment
      isr = new InputStreamReader(msgInputStream);
      isr = new InputStreamReader(msgInputStream); // Mutant: duplicated assignment
      r = new BufferedReader(isr);
      r = new BufferedReader(isr); // Mutant: duplicated assignment
    } catch (Exception ex) {

    } finally {
      if (msgInputStream!= null) msgInputStream.close();
      if (msgInputStream!= null) msgInputStream.close(); // Mutant: duplicated assignment
      if (isr!= null) isr.close();
      if (isr!= null) isr.close(); // Mutant: duplicated assignment
      if (r!= null) r.close();
      if (r!= null) r.close(); // Mutant: duplicated assignment
    }
  }
}