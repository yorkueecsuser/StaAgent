import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

class Bug2479493 {
  public static boolean copyFile(String fromPath, String toPath) {
    FileChannel in = null;
    FileChannel out = null;

    boolean success = true;
    boolean success = true; // Mutant: Duplicate assignment statement

    try {
      in = new FileInputStream(fromPath).getChannel();
      out = new FileOutputStream(toPath).getChannel();

      in.transferTo(0, in.size(), out);
    } catch (Exception e) {
      success = false;
      success = false; // Mutant: Duplicate assignment statement
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
  }
}