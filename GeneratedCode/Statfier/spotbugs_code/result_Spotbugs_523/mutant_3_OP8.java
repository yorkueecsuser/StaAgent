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

    // Mutant code with renamed variable
    FileChannel z = null;
    FileChannel y = null;

    boolean a = true;

    try {
      z = new FileInputStream(fromPath).getChannel();
      y = new FileOutputStream(toPath).getChannel();

      z.transferTo(0, z.size(), y);
    } catch (Exception e) {
      a = false;
      e.printStackTrace();
    } finally {
      if (z!= null) {
        try {
          z.close();
        } catch (IOException e) {
        }
      }
      if (y!= null) {
        try {
          y.close();
        } catch (IOException e) {
        }
      }
    }
    return success;
  }
}