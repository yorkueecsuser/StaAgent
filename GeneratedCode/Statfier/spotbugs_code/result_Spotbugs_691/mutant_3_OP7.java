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
      
      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() always returns false
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
      
      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() always returns false
      }
    } finally {
      fos.close();
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}