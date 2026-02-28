import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class CloseStream {
  public static void writeFile(File f, Object o) throws IOException {

    OutputStream out = new FileOutputStream(f);
    int i = o.hashCode();
    
    // Mutant code: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      out.write(i);
    } else {
      // This block will always execute
      out.close();
    }
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}