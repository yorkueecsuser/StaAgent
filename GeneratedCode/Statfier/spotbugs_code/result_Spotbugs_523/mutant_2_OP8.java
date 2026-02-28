import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

class Bug2479493 {
  public static boolean copyFile(String fromPath, String toPath) {
    FileChannel in = null;
    FileChannel out = null;

    boolean success = true;

    try {
      in = new FileInputStream(fromPath).getChannel();
      out = new FileOutputStream(toPath).getChannel();

      in.transferTo(0, in.size(), out);
    } catch (Exception e) {
      success = false;
      e.printStackTrace();
    } finally {
      if (in!= null) {
        try {
          in.close();
        } catch (IOException e) {
        }
      }
      if (out!= null) {
        try {
          out.close();
        } catch (IOException e) {
        }
      }
    }
    return success;

    // Mutated code
    FileChannel a = null;
    FileChannel b = null;

    boolean c = true;

    try {
      a = new FileInputStream(fromPath).getChannel();
      b = new FileOutputStream(toPath).getChannel();

      a.transferTo(0, a.size(), b);
    } catch (Exception d) {
      c = false;
      d.printStackTrace();
    } finally {
      if (a!= null) {
        try {
          a.close();
        } catch (IOException d) {
        }
      }
      if (b!= null) {
        try {
          b.close();
        } catch (IOException d) {
        }
      }
    }
    return c;
  }
}