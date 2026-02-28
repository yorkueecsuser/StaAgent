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
    ByteArrayOutputStream a = new ByteArrayOutputStream();
    ObjectOutputStream b = new ObjectOutputStream(a);
    b.writeObject(1337);
    b.close();
    byte[] bytes = a.toByteArray();
  }

  /** Another bugfix for aBad. */
  static void a2Ok() throws IOException {
    ByteArrayOutputStream c = new ByteArrayOutputStream();
    ObjectOutputStream d = new ObjectOutputStream(c);
    d.writeObject(1337);
    d.flush();
    byte[] bytes = c.toByteArray();
  }

  static void bBad() throws IOException {
    ByteArrayOutputStream e = new ByteArrayOutputStream();
    ObjectOutputStream f = new ObjectOutputStream(e);
    f.writeObject(1337);
    byte[] bytes = e.toByteArray();
    f.close();
  }

  static void cBad() throws IOException {
    ByteArrayOutputStream g = new ByteArrayOutputStream();
    DataOutputStream h = new DataOutputStream(g);
    h.writeLong(1337);
    byte[] bytes = g.toByteArray();
  }

  /**
   * This false positive is caused by the property being imprecise. However, it is also an example
   * where, arguably, GZIPOutputStream breaks the behavioral contract on OutputStream: it may be
   * surprising that finish() sends data to the underlying stream but flush() may not.
   */
  static byte[] FP_dOk(final byte[] src) throws IOException {
    ByteArrayOutputStream i = new ByteArrayOutputStream(src.length);
    GZIPOutputStream j = new GZIPOutputStream(i);
    j.write(src);
    j.finish();
    return i.toByteArray();
  }

  static byte[] FP_eOk(final byte[] src) throws IOException {
    ByteArrayOutputStream k = new ByteArrayOutputStream(src.length);
    GZIPOutputStream l = new GZIPOutputStream(k);
    try {
      l.write(src);
      l.finish();
    } catch (Exception e) {
    }
    return k.toByteArray();
  }
}