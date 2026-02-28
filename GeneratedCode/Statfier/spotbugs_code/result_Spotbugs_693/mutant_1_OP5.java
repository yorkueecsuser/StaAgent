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
      in.close(); // TODO: we should report a medium priority NP warning
      // here
      out.close(); // TODO: we should report a medium priority NP warning
      // here
      
      // Introduced unreachable switch statement
      boolean alwaysFalse = getCondition();
      switch (alwaysFalse) {
        case true:
          System.out.println("This will never be printed");
          break;
        default:
          System.out.println("This will also never be printed");
          break;
      }
    }
  }

  private static boolean getCondition() {
    return false;
  }
}