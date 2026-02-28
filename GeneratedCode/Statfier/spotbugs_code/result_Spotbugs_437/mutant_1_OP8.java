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
    FileOutputStream x = fos; // Mutant: Renamed fos to x

    try {

      x.write("abc".getBytes()); // Mutant: Updated fos to x

    } finally {

      safeCloseStream(x); // Mutant: Updated fos to x
    }
  }

  private void safeCloseStream(OutputStream object) {
    OutputStream y = object; // Mutant: Renamed object to y

    try {

      if (y!= null && y!= System.out && y!= System.err) { // Mutant: Updated object to y

        y.close(); // Mutant: Updated object to y
      }

    } catch (IOException e) {

      System.out.println("failed to close stream: " + e.getMessage());
    }
  }

  @Test
  public void testCloseCloseableFalsePositive() throws Exception {

    // FALSE POSITIVE: this line is flagged with OBL

    FileOutputStream fos = new FileOutputStream(File.createTempFile("prefix", "temp"));
    FileOutputStream z = fos; // Mutant: Renamed fos to z

    try {

      z.write("abc".getBytes()); // Mutant: Updated fos to z

    } finally {

      safeCloseCloseable(z); // Mutant: Updated fos to z
    }
  }

  private void safeCloseCloseable(Closeable object) {
    Closeable w = object; // Mutant: Renamed object to w

    try {

      if (w!= null && w!= System.out && w!= System.err) { // Mutant: Updated object to w

        w.close(); // Mutant: Updated object to w
      }

    } catch (IOException e) {

      System.out.println("failed to close stream: " + e.getMessage());
    }
  }
}