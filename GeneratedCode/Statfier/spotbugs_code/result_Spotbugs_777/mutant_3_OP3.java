import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class CloseStream {
  public static void writeFile(File f, Object o) throws IOException {

    OutputStream out = new FileOutputStream(f);
    int i = o.hashCode();
    
    // Introduced unreachable if statement based on mutation operator
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      out.write(i);
    }

    out.close();
  }

  // Method to ensure the condition is always false, making the if block unreachable
  private static boolean getCondition() {
    return false;
  }
}