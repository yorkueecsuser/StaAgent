import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.security.DigestOutputStream;
import java.util.zip.CheckedOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.InflaterOutputStream;
import javax.crypto.CipherOutputStream;

class FilterOutputStreamLeaks {

  // FilterOutputStream  tests

  public void filterOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream x;
    try {
      x = new FileOutputStream("file.txt");
      FilterOutputStream y = new FilterOutputStream(x);
      y.write(arr);
      y.close();
    } catch (IOException e) {
    }
  }

  public void filterOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream z;
    FilterOutputStream w = null;
    try {
      z = new FileOutputStream("file.txt");
      w = new FilterOutputStream(z);
      w.write(arr);
    } catch (IOException e) {
    } finally {
      if (w!= null) w.close();
    }
  }

  // DataOutputStream  tests

  public void dataOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream a;
    try {
      a = new FileOutputStream("file.txt");
      DataOutputStream b = new DataOutputStream(a);
      b.write(arr);
      b.close();
    } catch (IOException e) {
    }
  }

  public void dataOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream c;
    DataOutputStream d = null;
    try {
      c = new FileOutputStream("file.txt");
      d = new DataOutputStream(c);
      d.write(arr);
    } catch (IOException e) {
    } finally {
      if (d!= null) d.close();
    }
  }

  // BufferedOutputStream  tests

  public void bufferedOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream e = null;
    try {
      e = new FileOutputStream("file.txt");
      BufferedOutputStream f = new BufferedOutputStream(e);
      f.write(arr);
      f.close();
    } catch (IOException g) {
    }
  }

  public void bufferedOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream h;
    BufferedOutputStream i = null;
    try {
      h = new FileOutputStream("file.txt");
      i = new BufferedOutputStream(h);
      i.write(arr);
    } catch (IOException j) {
    } finally {
      if (i!= null) i.close();
    }
  }

  // CheckedOutputStream  tests

  public void checkedOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream k;
    try {
      k = new FileOutputStream("file.txt");
      CheckedOutputStream l = new CheckedOutputStream(k, null);
      l.write(arr);
      l.close();
    } catch (IOException m) {
    }
  }

  public void checkedOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream n;
    CheckedOutputStream o = null;
    try {
      n = new FileOutputStream("file.txt");
      o = new CheckedOutputStream(n, null);
      o.write(arr);
    } catch (IOException p) {
    } finally {
      if (o!= null) o.close();
    }
  }

  // CipherOutputStream  tests

  public void cipherOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream q;
    try {
      q = new FileOutputStream("file.txt");
      CipherOutputStream r = new CipherOutputStream(q, null);
      r.write(arr);
      r.close();
    } catch (IOException s) {
    }
  }

  public void cipherOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream t;
    CipherOutputStream u = null;
    try {
      t = new FileOutputStream("file.txt");
      u = new CipherOutputStream(t, null);
      u.write(arr);
    } catch (IOException v) {
    } finally {
      if (u!= null) u.close();
    }
  }

  // DeflaterOutputStream  tests

  public void deflaterOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream w;
    try {
      w = new FileOutputStream("file.txt");
      DeflaterOutputStream x = new DeflaterOutputStream(w, null);
      x.write(arr);
      x.close();
    } catch (IOException y) {
    }
  }

  public void deflaterOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream z;
    DeflaterOutputStream a = null;
    try {
      z = new FileOutputStream("file.txt");
      a = new DeflaterOutputStream(z, null);
      a.write(arr);
    } catch (IOException b) {
    } finally {
      if (a!= null) a.close();
    }
  }

  // DigestOutputStream  tests

  public void digestOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream c;
    try {
      c = new FileOutputStream("file.txt");
      DigestOutputStream d = new DigestOutputStream(c, null);
      d.write(arr);
      d.close();
    } catch (IOException e) {
    }
  }

  public void digestOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream f;
    DigestOutputStream g = null;
    try {
      f = new FileOutputStream("file.txt");
      g = new DigestOutputStream(f, null);
      g.write(arr);
    } catch (IOException h) {
    } finally {
      if (g!= null) g.close();
    }
  }

  // InflaterOutputStream  tests

  public void inflaterOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream i;
    try {
      i = new FileOutputStream("file.txt");
      InflaterOutputStream j = new InflaterOutputStream(i, null);
      j.write(arr);
      j.close();
    } catch (IOException k) {
    }
  }

  public void inflaterOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream l;
    InflaterOutputStream m = null;
    try {
      l = new FileOutputStream("file.txt");
      m = new InflaterOutputStream(l, null);
      m.write(arr);
    } catch (IOException n) {
    } finally {
      if (m!= null) m.close();
    }
  }

  // GZipOutputStream  tests

  public void gzipOutputStreamNotClosedAfterFlush() {
    FileOutputStream o;
    try {
      o = new FileOutputStream("file.txt");
      GZIPOutputStream p = new GZIPOutputStream(o);
      p.flush();
      p.close();
    } catch (IOException q) {
    }
  }

  public void gzipOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream r = null;
    GZIPOutputStream s = null;
    try {
      r = new FileOutputStream("file.txt");
      s = new GZIPOutputStream(r);
      s.write(arr);
    } catch (IOException t) {
    } finally {
      if (s!= null) s.close();
      else if (r!= null) r.close();
    }
  }

  // PrintStream  tests

  public void printStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream u;
    try {
      u = new FileOutputStream("file.txt");
      InflaterOutputStream v = new InflaterOutputStream(u, null);
      v.write(arr);
    } catch (IOException w) {
    }
  }

  public void printStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream x;
    InflaterOutputStream y = null;
    try {
      x = new FileOutputStream("file.txt");
      y = new InflaterOutputStream(x, null);
      y.write(arr);
    } catch (IOException z) {
    } finally {
      if (y!= null) y.close();
    }
  }
}