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
  }

  static void cBad() throws IOException {
    ByteArrayOutputStream a = new ByteArrayOutputStream();
    DataOutputStream b = new DataOutputStream(a);
    b.writeLong(1337);
    byte[] c = a.toByteArray();
  }

  /**
   * This false positive is caused by the property being imprecise. However, it is also an example
   * where, arguably, GZIPOutputStream breaks the behavioral contract on OutputStream: it may be
   * surprising that finish() sends data to the underlying stream but flush() may not.
   */
  static byte[] FP_dOk(final byte[] src) throws IOException {
    ByteArrayOutputStream d = new ByteArrayOutputStream(src.length);
    GZIPOutputStream e = new GZIPOutputStream(d);
    e.write(src);
    e.finish();
    return d.toByteArray();
  }

  static byte[] FP_eOk(final byte[] src) throws IOException {
    ByteArrayOutputStream f = new ByteArrayOutputStream(src.length);
    GZIPOutputStream g = new GZIPOutputStream(f);
    try {
      g.write(src);
      g.finish();
    } catch (Exception h) {
    }
    return f.toByteArray();
  }
}