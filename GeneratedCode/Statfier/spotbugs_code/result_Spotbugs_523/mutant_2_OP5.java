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

      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case will never be executed because getCondition() always returns false
          success = false;
          break;
        default:
          // Default case will also never be executed due to the same reason
          success = true;
          break;
      }
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
  }

  // Method to provide a dynamic condition that always evaluates to false
  private static boolean getCondition() {
    return false;
  }
}