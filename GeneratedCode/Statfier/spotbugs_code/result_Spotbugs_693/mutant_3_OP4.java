import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

class ErrorInFinallyClause {
  public static void copy(String from, String to) throws Exception {
    InputStream in = null;
    OutputStream out = null;
    try {
      in = new FileInputStream(from);
      out = new FileOutputStream(to);
      byte[] buf = new byte[1024];

      while (true) {
        int sz = in.read(buf);
        if (sz < 0) break;
        out.write(buf, 0, sz);
      }

    } finally {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is a unique unreachable if-else statement
        System.out.println("This is an unreachable if block");
      } else {
        System.out.println("This is an unreachable else block");
      }
      
      in.close(); // TODO: we should report a medium priority NP warning
      // here
      out.close(); // TODO: we should report a medium priority NP warning
      // here

    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}