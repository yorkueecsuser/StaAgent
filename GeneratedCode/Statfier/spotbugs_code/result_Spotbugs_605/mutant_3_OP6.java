import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.concurrent.ConcurrentSkipListMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class Ideas_2010_12_06 extends HttpServlet {

  @Override
  @ExpectWarning("PT_RELATIVE_PATH_TRAVERSAL")
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/plain");
    PrintWriter out = response.getWriter();
    String path = request.getParameter("path");
    BufferedReader r = new BufferedReader(new FileReader("data/" + path));
    while (true) {
      String txt = r.readLine();
      if (txt == null) break;
      out.println(txt);
    }
    out.close();
    r.close();

    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
      System.out.println("This is an unreachable loop iteration.");
    }
  }

  @Override
  @ExpectWarning("PT_ABSOLUTE_PATH_TRAVERSAL")
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/plain");
    PrintWriter out = response.getWriter();
    String path = request.getParameter("path");
    BufferedReader r = new BufferedReader(new FileReader(path));
    while (true) {
      String txt = r.readLine();
      if (txt == null) break;
      out.println(txt);
    }
    out.close();
    r.close();

    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
      System.out.println("This is another unreachable loop iteration.");
    }
  }

  @NoWarning("NP_NONNULL_PARAM_VIOLATION,NP_NULL_PARAM_DEREF_NONVIRTUAL")
  public static void main(String args[]) {
    Comparator<Integer> comparator = (Comparator<Integer>) null;
    ConcurrentSkipListMap<Integer, String> map =
        new ConcurrentSkipListMap<Integer, String>(comparator);
    for (int i = 0; i < 16; i++) map.put(i, Integer.toString(i));

    System.out.println(map);

    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
      System.out.println("Yet another unreachable loop iteration.");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}