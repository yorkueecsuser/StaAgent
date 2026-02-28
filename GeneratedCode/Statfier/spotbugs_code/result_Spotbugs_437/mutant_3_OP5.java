import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.junit.Test;

/**
 * FindBugs OBL false positive.
 *
 * <p>The difference is the argument to safeClose(). If it is a Closeable, FindBugs OBL generates a
 *
 * <p>false positive.
 */
class Bug2136033 {

  @Test
  public void testCloseStream() throws Exception {

    // ok: this line is not flagged with OBL

    FileOutputStream fos = new FileOutputStream(File.createTempFile("prefix", "temp"));

    try {

      fos.write("abc".getBytes());

    } finally {

      safeCloseStream(fos);
    }
  }

  private void safeCloseStream(OutputStream object) {

    try {

      if (object!= null && object!= System.out && object!= System.err) {

        object.close();
      }

    } catch (IOException e) {

      System.out.println("failed to close stream: " + e.getMessage());
    }

    // Unreachable switch statement mutation
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This will never be printed");
        break;
      default:
        // Default case to ensure switch is not empty
        break;
    }
  }

  @Test
  public void testCloseCloseableFalsePositive() throws Exception {

    // FALSE POSITIVE: this line is flagged with OBL

    FileOutputStream fos = new FileOutputStream(File.createTempFile("prefix", "temp"));

    try {

      fos.write("abc".getBytes());

    } finally {

      safeCloseCloseable(fos);
    }
  }

  private void safeCloseCloseable(Closeable object) {

    try {

      if (object!= null && object!= System.out && object!= System.err) {

        object.close();
      }

    } catch (IOException e) {

      System.out.println("failed to close stream: " + e.getMessage());
    }

    // Unreachable switch statement mutation
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This will never be printed");
        break;
      default:
        // Default case to ensure switch is not empty
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}