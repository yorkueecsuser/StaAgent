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
    FileOutputStream fis;
    try {
      fis = new FileOutputStream("file.txt");
      FilterOutputStream fos = new FilterOutputStream(fis);
      fos.write(arr);
      fos.close();
    } catch (IOException e) {
    }
  }

  public void filterOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream a;
    FilterOutputStream b = null;
    try {
      a = new FileOutputStream("file.txt");
      b = new FilterOutputStream(a);
      b.write(arr);
    } catch (IOException e) {
    } finally {
      if (b!= null) b.close();
    }
  }

  // DataOutputStream  tests

  public void dataOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream c;
    try {
      c = new FileOutputStream("file.txt");
      DataOutputStream d = new DataOutputStream(c);
      d.write(arr);
      d.close();
    } catch (IOException e) {
    }
  }

  public void dataOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream e;
    DataOutputStream f = null;
    try {
      e = new FileOutputStream("file.txt");
      f = new DataOutputStream(e);
      f.write(arr);
    } catch (IOException e) {
    } finally {
      if (f!= null) f.close();
    }
  }

  // BufferedOutputStream  tests

  public void bufferedOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream g = null;
    try {
      g = new FileOutputStream("file.txt");
      BufferedOutputStream h = new BufferedOutputStream(g);
      h.write(arr);
      h.close();
    } catch (IOException e) {
    }
  }

  public void bufferedOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream i;
    BufferedOutputStream j = null;
    try {
      i = new FileOutputStream("file.txt");
      j = new BufferedOutputStream(i);
      j.write(arr);
    } catch (IOException e) {
    } finally {
      if (j!= null) j.close();
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
    } catch (IOException e) {
    }
  }

  public void checkedOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream m;
    CheckedOutputStream n = null;
    try {
      m = new FileOutputStream("file.txt");
      n = new CheckedOutputStream(m, null);
      n.write(arr);
    } catch (IOException e) {
    } finally {
      if (n!= null) n.close();
    }
  }

  // CipherOutputStream  tests

  public void cipherOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream o;
    try {
      o = new FileOutputStream("file.txt");
      CipherOutputStream p = new CipherOutputStream(o, null);
      p.write(arr);
      p.close();
    } catch (IOException e) {
    }
  }

  public void cipherOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream q;
    CipherOutputStream r = null;
    try {
      q = new FileOutputStream("file.txt");
      r = new CipherOutputStream(q, null);
      r.write(arr);
    } catch (IOException e) {
    } finally {
      if (r!= null) r.close();
    }
  }

  // DeflaterOutputStream  tests

  public void deflaterOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream s;
    try {
      s = new FileOutputStream("file.txt");
      DeflaterOutputStream t = new DeflaterOutputStream(s, null);
      t.write(arr);
      t.close();
    } catch (IOException e) {
    }
  }

  public void deflaterOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream u;
    DeflaterOutputStream v = null;
    try {
      u = new FileOutputStream("file.txt");
      v = new DeflaterOutputStream(u, null);
      v.write(arr);
    } catch (IOException e) {
    } finally {
      if (v!= null) v.close();
    }
  }

  // DigestOutputStream  tests

  public void digestOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream w;
    try {
      w = new FileOutputStream("file.txt");
      DigestOutputStream x = new DigestOutputStream(w, null);
      x.write(arr);
      x.close();
    } catch (IOException e) {
    }
  }

  public void digestOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream y;
    DigestOutputStream z = null;
    try {
      y = new FileOutputStream("file.txt");
      z = new DigestOutputStream(y, null);
      z.write(arr);
    } catch (IOException e) {
    } finally {
      if (z!= null) z.close();
    }
  }

  // InflaterOutputStream  tests

  public void inflaterOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream aa;
    try {
      aa = new FileOutputStream("file.txt");
      InflaterOutputStream ab = new InflaterOutputStream(aa, null);
      ab.write(arr);
      ab.close();
    } catch (IOException e) {
    }
  }

  public void inflaterOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream ac;
    InflaterOutputStream ad = null;
    try {
      ac = new FileOutputStream("file.txt");
      ad = new InflaterOutputStream(ac, null);
      ad.write(arr);
    } catch (IOException e) {
    } finally {
      if (ad!= null) ad.close();
    }
  }

  // GZipOutputStream  tests

  public void gzipOutputStreamNotClosedAfterFlush() {
    FileOutputStream ae;
    try {
      ae = new FileOutputStream("file.txt");
      GZIPOutputStream af = new GZIPOutputStream(ae);
      af.flush();
      af.close();
    } catch (IOException e) {
    }
  }

  public void gzipOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream ag = null;
    GZIPOutputStream ah = null;
    try {
      ag = new FileOutputStream("file.txt");
      ah = new GZIPOutputStream(ag);
      ah.write(arr);
    } catch (IOException e) {
    } finally {
      if (ah!= null) ah.close();
      else if (ag!= null) ag.close();
    }
  }

  // PrintStream  tests

  public void printStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream ai;
    try {
      ai = new FileOutputStream("file.txt");
      InflaterOutputStream aj = new InflaterOutputStream(ai, null);
      aj.write(arr);
    } catch (IOException e) {
    }
  }

  public void printStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream ak;
    InflaterOutputStream al = null;
    try {
      ak = new FileOutputStream("file.txt");
      al = new InflaterOutputStream(ak, null);
      al.write(arr);
    } catch (IOException e) {
    } finally {
      if (al!= null) al.close();
    }
  }
}