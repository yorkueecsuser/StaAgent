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
      in = new FileInputStream(from); // Mutant: duplicated assignment
      out = new FileOutputStream(to);
      out = new FileOutputStream(to); // Mutant: duplicated assignment
      byte[] buf = new byte[1024];
      buf = new byte[1024]; // Mutant: duplicated assignment

      while (true) {
        int sz = in.read(buf);
        sz = in.read(buf); // Mutant: duplicated assignment
        if (sz < 0) break;
        out.write(buf, 0, sz);
        out.write(buf, 0, sz); // Mutant: duplicated assignment
      }

    } finally {
      in.close(); // TODO: we should report a medium priority NP warning
      // here
      in.close(); // Mutant: duplicated assignment
      out.close(); // TODO: we should report a medium priority NP warning
      // here
      out.close(); // Mutant: duplicated assignment

    }
  }
}