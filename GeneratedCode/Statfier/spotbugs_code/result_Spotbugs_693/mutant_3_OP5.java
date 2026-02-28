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
      boolean alwaysFalse = getCondition();
      switch (alwaysFalse) {
        case true:
          // This case is unreachable because alwaysFalse is never true
          System.out.println("This is an unreachable case.");
          break;
        default:
          // Default case to ensure switch is not empty
          break;
      }
      in.close(); // TODO: we should report a medium priority NP warning
      // here
      out.close(); // TODO: we should report a medium priority NP warning
      // here

    }
  }

  private static boolean getCondition() {
    return false;
  }
}