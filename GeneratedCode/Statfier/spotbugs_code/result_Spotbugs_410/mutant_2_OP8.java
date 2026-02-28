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
    } catch (Exception ex) {

    }

    // Mutant code
    InputStream x = null;
    BufferedReader y = null;
    InputStreamReader z = null;
    try {
      x = request.getInputStream();
      z = new InputStreamReader(x);
      y = new BufferedReader(z);
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
    } catch (Exception ex) {

    }

    // Mutant code
    InputStream a = null;
    try {
      a = request.getInputStream();
      int c = a.read();
      System.out.println(c);
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
    } catch (Exception ex) {

    } finally {
      if (msgInputStream!= null) msgInputStream.close();
      if (isr!= null) isr.close();
      if (r!= null) r.close();
    }

    // Mutant code
    InputStream q = null;
    BufferedReader w = null;
    InputStreamReader e = null;
    try {
      q = request.getInputStream();
      e = new InputStreamReader(q);
      w = new BufferedReader(e);
    } catch (Exception ex) {

    } finally {
      if (q!= null) q.close();
      if (e!= null) e.close();
      if (w!= null) w.close();
    }
  }
}