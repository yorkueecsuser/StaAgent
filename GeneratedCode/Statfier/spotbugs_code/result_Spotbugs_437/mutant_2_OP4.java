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

      // Unreachable if-else statement mutant
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable block");
      } else {
        // Alternative code that also should never execute
        System.out.println("This is another unreachable block");
      }

    } catch (IOException e) {

      System.out.println("failed to close stream: " + e.getMessage());
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

      // Unreachable if-else statement mutant
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable block");
      } else {
        // Alternative code that also should never execute
        System.out.println("This is another unreachable block");
      }

    } catch (IOException e) {

      System.out.println("failed to close stream: " + e.getMessage());
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else branches are unreachable
  }
}