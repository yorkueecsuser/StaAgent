import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPOutputStream;

class BaosTest {
  static void aBad() throws IOException {
    ByteArrayOutputStream x = new ByteArrayOutputStream();
    ObjectOutputStream y = new ObjectOutputStream(x);
    y.writeObject(1337);
    byte[] bytes = x.toByteArray(); // This may return partial results.

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  /** Bugfix for aBad. */
  static void a1Ok() throws IOException {
    ByteArrayOutputStream x = new ByteArrayOutputStream();
    ObjectOutputStream y = new ObjectOutputStream(x);
    y.writeObject(1337);
    y.close();
    byte[] bytes = x.toByteArray();
  }

  /** Another bugfix for aBad. */
  static void a2Ok() throws IOException {
    ByteArrayOutputStream x = new ByteArrayOutputStream();
    ObjectOutputStream y = new ObjectOutputStream(x);
    y.writeObject(1337);
    y.flush();
    byte[] bytes = x.toByteArray();
  }

  static void bBad() throws IOException {
    ByteArrayOutputStream x = new ByteArrayOutputStream();
    ObjectOutputStream y = new ObjectOutputStream(x);
    y.writeObject(1337);
    byte[] bytes = x.toByteArray();
    y.close();

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  static void cBad() throws IOException {
    ByteArrayOutputStream x = new ByteArrayOutputStream();
    DataOutputStream y = new DataOutputStream(x);
    y.writeLong(1337);
    byte[] bytes = x.toByteArray();

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  /**
   * This false positive is caused by the property being imprecise. However, it is also an example
   * where, arguably, GZIPOutputStream breaks the behavioral contract on OutputStream: it may be
   * surprising that finish() sends data to the underlying stream but flush() may not.
   */
  static byte[] FP_dOk(final byte[] src) throws IOException {
    ByteArrayOutputStream x = new ByteArrayOutputStream(src.length);
    GZIPOutputStream y = new GZIPOutputStream(x);
    y.write(src);
    y.finish();
    return x.toByteArray();

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  static byte[] FP_eOk(final byte[] src) throws IOException {
    ByteArrayOutputStream x = new ByteArrayOutputStream(src.length);
    GZIPOutputStream y = new GZIPOutputStream(x);
    try {
      y.write(src);
      y.finish();
    } catch (Exception e) {
    }
    return x.toByteArray();

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}