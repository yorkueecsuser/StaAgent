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
    } finally {
      // Inserting unreachable if-else branch
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        fos.write(new byte[]{0});
      } else {
        // This block will always execute
        fos.flush();
      }
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
    } finally {
      // Inserting unreachable if-else branch
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        fos.write(new byte[]{0});
      } else {
        // This block will always execute
        fos.close();
      }
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}