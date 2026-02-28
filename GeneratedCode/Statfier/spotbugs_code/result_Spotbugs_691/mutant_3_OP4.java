import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Bug3424971 {

  @ExpectWarning("OS_OPEN_STREAM_EXCEPTION_PATH")
  public static void writeInFile(final File file, final byte[] content)
      throws FileNotFoundException, IOException {
    FileOutputStream fos = null;

    try {
      fos = new FileOutputStream(file);
      fos.write(content);
      
      // Mutant: Inserting an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
        System.out.println("This block is reachable");
      } else {
        // This block is unreachable because shouldRun is always false
        System.out.println("This block is unreachable");
      }
    } finally {
      fos.flush();
      fos.close();
    }
  }

  @NoWarning("OS_OPEN_STREAM_EXCEPTION_PATH")
  public static void writeInFile2(final File file, final byte[] content)
      throws FileNotFoundException, IOException {
    FileOutputStream fos = null;

    try {
      fos = new FileOutputStream(file);
      fos.write(content);
      
      // Mutant: Inserting an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
        System.out.println("This block is reachable in writeInFile2");
      } else {
        // This block is unreachable because shouldRun is always false
        System.out.println("This block is unreachable in writeInFile2");
      }
    } finally {
      fos.close();
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This ensures the else block is unreachable
  }
}