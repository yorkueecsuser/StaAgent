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

      // Mutated code
      InputStream a = null;
      OutputStream b = null;
      try {
        a = new FileInputStream(from);
        b = new FileOutputStream(to);
        byte[] c = new byte[1024];

        while (true) {
          int d = a.read(c);
          if (d < 0) break;
          b.write(c, 0, d);
        }

      } finally {
        a.close();
        b.close();
      }
    }
  }
}