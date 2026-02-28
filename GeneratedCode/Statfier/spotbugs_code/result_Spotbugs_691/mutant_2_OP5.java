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
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("This will never be printed");
          break;
      }
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
    } finally {
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("This will never be printed");
          break;
      }
      fos.close();
    }
  }

  // Method to simulate a dynamic condition that always returns false
  private static boolean getCondition() {
    return false;
  }
}