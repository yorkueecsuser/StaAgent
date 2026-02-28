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

      // Inserting an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block will never execute because condition is always false
        System.out.println("This is an unreachable block");
        success = false;
      } else {
        // This block will always execute
        System.out.println("This is the reachable block");
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

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}