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
    FileOutputStream fis;
    try {
      fis = new FileOutputStream("file.txt");
      DataOutputStream dos = new DataOutputStream(fis);
      dos.write(arr);
      dos.close();
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
    FileOutputStream fis = null;
    try {
      fis = new FileOutputStream("file.txt");
      BufferedOutputStream bos = new BufferedOutputStream(fis);
      bos.write(arr);
      bos.close();
    } catch (IOException e) {
    }
  }

  public void bufferedOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream e;
    BufferedOutputStream f = null;
    try {
      e = new FileOutputStream("file.txt");
      f = new BufferedOutputStream(e);
      f.write(arr);
    } catch (IOException g) {
    } finally {
      if (f!= null) f.close();
    }
  }

  // CheckedOutputStream  tests

  public void checkedOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream fis;
    try {
      fis = new FileOutputStream("file.txt");
      CheckedOutputStream chos = new CheckedOutputStream(fis, null);
      chos.write(arr);
      chos.close();
    } catch (IOException e) {
    }
  }

  public void checkedOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream h;
    CheckedOutputStream i = null;
    try {
      h = new FileOutputStream("file.txt");
      i = new CheckedOutputStream(h, null);
      i.write(arr);
    } catch (IOException e) {
    } finally {
      if (i!= null) i.close();
    }
  }

  // CipherOutputStream  tests

  public void cipherOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream fis;
    try {
      fis = new FileOutputStream("file.txt");
      CipherOutputStream cos = new CipherOutputStream(fis, null);
      cos.write(arr);
      cos.close();
    } catch (IOException e) {
    }
  }

  public void cipherOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream j;
    CipherOutputStream k = null;
    try {
      j = new FileOutputStream("file.txt");
      k = new CipherOutputStream(j, null);
      k.write(arr);
    } catch (IOException e) {
    } finally {
      if (k!= null) k.close();
    }
  }

  // DeflaterOutputStream  tests

  public void deflaterOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream fis;
    try {
      fis = new FileOutputStream("file.txt");
      DeflaterOutputStream dos = new DeflaterOutputStream(fis, null);
      dos.write(arr);
      dos.close();
    } catch (IOException e) {
    }
  }

  public void deflaterOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream l;
    DeflaterOutputStream m = null;
    try {
      l = new FileOutputStream("file.txt");
      m = new DeflaterOutputStream(l, null);
      m.write(arr);
    } catch (IOException e) {
    } finally {
      if (m!= null) m.close();
    }
  }

  // DigestOutputStream  tests

  public void digestOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream fis;
    try {
      fis = new FileOutputStream("file.txt");
      DigestOutputStream dos = new DigestOutputStream(fis, null);
      dos.write(arr);
      dos.close();
    } catch (IOException e) {
    }
  }

  public void digestOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream n;
    DigestOutputStream o = null;
    try {
      n = new FileOutputStream("file.txt");
      o = new DigestOutputStream(n, null);
      o.write(arr);
    } catch (IOException e) {
    } finally {
      if (o!= null) o.close();
    }
  }

  // InflaterOutputStream  tests

  public void inflaterOutputStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream fis;
    try {
      fis = new FileOutputStream("file.txt");
      InflaterOutputStream ios = new InflaterOutputStream(fis, null);
      ios.write(arr);
      ios.close();
    } catch (IOException e) {
    }
  }

  public void inflaterOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream p;
    InflaterOutputStream q = null;
    try {
      p = new FileOutputStream("file.txt");
      q = new InflaterOutputStream(p, null);
      q.write(arr);
    } catch (IOException e) {
    } finally {
      if (q!= null) q.close();
    }
  }

  // GZipOutputStream  tests

  public void gzipOutputStreamNotClosedAfterFlush() {
    FileOutputStream fos;
    try {
      fos = new FileOutputStream("file.txt");
      GZIPOutputStream gzipOutputStream = new GZIPOutputStream(fos);
      gzipOutputStream.flush();
      gzipOutputStream.close();
    } catch (IOException e) {
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
    } catch (IOException e) {
    } finally {
      if (s!= null) s.close();
      else if (r!= null) r.close();
    }
  }

  // PrintStream  tests

  public void printStreamNotClosedAfterWrite() {
    byte[] arr = {1, 2, 3};
    FileOutputStream fis;
    try {
      fis = new FileOutputStream("file.txt");
      InflaterOutputStream printer = new InflaterOutputStream(fis, null);
      printer.write(arr);
    } catch (IOException e) {
    }
  }

  public void printStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream t;
    InflaterOutputStream u = null;
    try {
      t = new FileOutputStream("file.txt");
      u = new InflaterOutputStream(t, null);
      u.write(arr);
    } catch (IOException e) {
    } finally {
      if (u!= null) u.close();
    }
  }
}