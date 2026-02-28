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
      // Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        fos.write(new byte[]{0});
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
      // Inserting unreachable if branch
      boolean condition = getCondition2();
      if (condition) {
        // This block is unreachable because getCondition2() always returns false
        fos.write(new byte[]{1});
      }
      fos.close();
    }
  }

  private static boolean getCondition() {
    return false;
  }

  private static boolean getCondition2() {
    return false;
  }
}