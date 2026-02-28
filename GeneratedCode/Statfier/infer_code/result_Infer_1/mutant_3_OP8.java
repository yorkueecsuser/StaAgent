import java.io.*;
import java.security.DigestInputStream;
import java.util.zip.CheckedInputStream;
import java.util.zip.DeflaterInputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import javax.crypto.CipherInputStream;

class FilterInputStreamLeaks {

  // BufferedInputStream  tests

  public void bufferedInputStreamNotClosedAfterRead() {
    FileInputStream fis;
    try {
      fis = new FileInputStream("file.txt");
      BufferedInputStream bis = new BufferedInputStream(fis);
      bis.read();
      bis.close();
    } catch (IOException e) {
    }
    // Mutant
    FileInputStream a;
    try {
      a = new FileInputStream("file.txt");
      BufferedInputStream b = new BufferedInputStream(a);
      b.read();
      b.close();
    } catch (IOException e) {
    }
  }

  public void bufferedInputStreamClosedAfterReset() throws IOException {
    FileInputStream fis;
    BufferedInputStream bis = null;
    try {
      fis = new FileInputStream("file.txt");
      bis = new BufferedInputStream(fis);
      bis.reset();
    } catch (IOException e) {
    } finally {
      if (bis!= null) bis.close();
    }
    // Mutant
    FileInputStream c;
    BufferedInputStream d = null;
    try {
      c = new FileInputStream("file.txt");
      d = new BufferedInputStream(c);
      d.reset();
    } catch (IOException e) {
    } finally {
      if (d!= null) d.close();
    }
  }

  // CheckedInputStream  tests

  public void checkedInputStreamNotClosedAfterRead() {
    FileInputStream fis;
    try {
      fis = new FileInputStream("file.txt");
      CheckedInputStream chis = new CheckedInputStream(fis, null);
      chis.read();
      chis.close();
    } catch (IOException e) {
    }
    // Mutant
    FileInputStream e;
    try {
      e = new FileInputStream("file.txt");
      CheckedInputStream f = new CheckedInputStream(e, null);
      f.read();
      f.close();
    } catch (IOException e1) {
    }
  }

  public void checkedInputStreamClosedAfterSkip() throws IOException {
    FileInputStream fis;
    CheckedInputStream chis = null;
    try {
      fis = new FileInputStream("file.txt");
      chis = new CheckedInputStream(fis, null);
      chis.skip(5);
    } catch (IOException e) {
    } finally {
      if (chis!= null) chis.close();
    }
    // Mutant
    FileInputStream g;
    CheckedInputStream h = null;
    try {
      g = new FileInputStream("file.txt");
      h = new CheckedInputStream(g, null);
      h.skip(5);
    } catch (IOException e) {
    } finally {
      if (h!= null) h.close();
    }
  }

  // CipherInputStream  tests

  public void cipherInputStreamNotClosedAfterSkip() {
    FileInputStream fis;
    try {
      fis = new FileInputStream("file.txt");
      CipherInputStream cis = new CipherInputStream(fis, null);
      cis.skip(8);
      cis.close();
    } catch (IOException e) {
    }
    // Mutant
    FileInputStream i;
    try {
      i = new FileInputStream("file.txt");
      CipherInputStream j = new CipherInputStream(i, null);
      j.skip(8);
      j.close();
    } catch (IOException e) {
    }
  }

  public void cipherInputStreamClosedAfterRead() throws IOException {
    FileInputStream fis;
    CipherInputStream cis = null;
    try {
      fis = new FileInputStream("file.txt");
      cis = new CipherInputStream(fis, null);
      cis.read();
    } catch (IOException e) {
    } finally {
      if (cis!= null) cis.close();
    }
    // Mutant
    FileInputStream k;
    CipherInputStream l = null;
    try {
      k = new FileInputStream("file.txt");
      l = new CipherInputStream(k, null);
      l.read();
    } catch (IOException e) {
    } finally {
      if (l!= null) l.close();
    }
  }

  // DataInputStream  tests

  public void dataInputStreamNotClosedAfterRead() {
    byte[] arr = new byte[10];
    FileInputStream fis;
    try {
      fis = new FileInputStream("file.txt");
      DataInputStream dis = new DataInputStream(fis);
      dis.read(arr);
      dis.close();
    } catch (IOException e) {
    }
    // Mutant
    byte[] m = new byte[10];
    FileInputStream n;
    try {
      n = new FileInputStream("file.txt");
      DataInputStream o = new DataInputStream(n);
      o.read(m);
      o.close();
    } catch (IOException e) {
    }
  }

  public void dataInputStreamClosedAfterReadBoolean() throws IOException {
    FileInputStream fis;
    DataInputStream dis = null;
    try {
      fis = new FileInputStream("file.txt");
      dis = new DataInputStream(fis);
      dis.readBoolean();
    } catch (IOException e) {
    } finally {
      if (dis!= null) dis.close();
    }
    // Mutant
    FileInputStream p;
    DataInputStream q = null;
    try {
      p = new FileInputStream("file.txt");
      q = new DataInputStream(p);
      q.readBoolean();
    } catch (IOException e) {
    } finally {
      if (q!= null) q.close();
    }
  }

  // DeflaterInputStream  tests

  public void deflaterInputStreamNotClosedAfterRead() {
    FileInputStream fis;
    try {
      fis = new FileInputStream("file.txt");
      DeflaterInputStream dis = new DeflaterInputStream(fis, null);
      dis.read();
      dis.close();
    } catch (IOException e) {
    }
    // Mutant
    FileInputStream r;
    try {
      r = new FileInputStream("file.txt");
      DeflaterInputStream s = new DeflaterInputStream(r, null);
      s.read();
      s.close();
    } catch (IOException e) {
    }
  }

  public void deflaterInputStreamClosedAfterReset() throws IOException {
    FileInputStream fis;
    DeflaterInputStream dis = null;
    try {
      fis = new FileInputStream("file.txt");
      dis = new DeflaterInputStream(fis, null);
      dis.reset();
    } catch (IOException e) {
    } finally {
      if (dis!= null) dis.close();
    }
    // Mutant
    FileInputStream t;
    DeflaterInputStream u = null;
    try {
      t = new FileInputStream("file.txt");
      u = new DeflaterInputStream(t, null);
      u.reset();
    } catch (IOException e) {
    } finally {
      if (u!= null) u.close();
    }
  }

  // GZipInputStream  tests

  public void gzipInputStreamNotClosedAfterRead() {
    FileInputStream fis;
    try {
      fis = new FileInputStream("file.txt");
      GZIPInputStream gzipInputStream = new GZIPInputStream(fis);
      gzipInputStream.read();
      gzipInputStream.close();
    } catch (IOException e) {
    }
    // Mutant
    FileInputStream v;
    try {
      v = new FileInputStream("file.txt");
      GZIPInputStream w = new GZIPInputStream(v);
      w.read();
      w.close();
    } catch (IOException e) {
    }
  }

  public void gzipInputStreamClosedAfterRead() throws IOException {
    FileInputStream fis = null;
    GZIPInputStream gzipInputStream = null;
    try {
      fis = new FileInputStream("file.txt");
      gzipInputStream = new GZIPInputStream(fis);
      gzipInputStream.read();
    } catch (IOException e) {
    } finally {
      if (gzipInputStream!= null) gzipInputStream.close();
      else if (fis!= null) fis.close();
    }
    // Mutant
    FileInputStream x = null;
    GZIPInputStream y = null;
    try {
      x = new FileInputStream("file.txt");
      y = new GZIPInputStream(x);
      y.read();
    } catch (IOException e) {
    } finally {
      if (y!= null) y.close();
      else if (x!= null) x.close();
    }
  }

  // DigestInputStream  tests

  public void digestInputStreamNotClosedAfterRead() {
    byte[] arr = new byte[10];
    FileInputStream fis;
    try {
      fis = new FileInputStream("file.txt");
      DigestInputStream dis = new DigestInputStream(fis, null);
      dis.read(arr);
      dis.close();
    } catch (IOException e) {
    }
    // Mutant
    byte[] z = new byte[10];
    FileInputStream aa;
    try {
      aa = new FileInputStream("file.txt");
      DigestInputStream ab = new DigestInputStream(aa, null);
      ab.read(z);
      ab.close();
    } catch (IOException e) {
    }
  }

  public void digestInputStreamClosedAfterRead() throws IOException {
    FileInputStream fis;
    DigestInputStream dis = null;
    try {
      fis = new FileInputStream("file.txt");
      dis = new DigestInputStream(fis, null);
      dis.read();
    } catch (IOException e) {
    } finally {
      if (dis!= null) dis.close();
    }
    // Mutant
    FileInputStream ac;
    DigestInputStream ad = null;
    try {
      ac = new FileInputStream("file.txt");
      ad = new DigestInputStream(ac, null);
      ad.read();
    } catch (IOException e) {
    } finally {
      if (ad!= null) ad.close();
    }
  }

  // InflaterInputStream  tests

  public void inflaterInputStreamNotClosedAfterRead() {
    FileInputStream fis;
    try {
      fis = new FileInputStream("file.txt");
      InflaterInputStream iis = new InflaterInputStream(fis, null);
      iis.read();
      iis.close();
    } catch (IOException e) {
    }
    // Mutant
    FileInputStream ae;
    try {
      ae = new FileInputStream("file.txt");
      InflaterInputStream af = new InflaterInputStream(ae, null);
      af.read();
      af.close();
    } catch (IOException e) {
    }
  }

  public void inflaterInputStreamClosedAfterAvailable() throws IOException {
    FileInputStream fis;
    InflaterInputStream iis = null;
    try {
      fis = new FileInputStream("file.txt");
      iis = new InflaterInputStream(fis, null);
      iis.available();
    } catch (IOException e) {
    } finally {
      if (iis!= null) iis.close();
    }
    // Mutant
    FileInputStream ag;
    InflaterInputStream ah = null;
    try {
      ag = new FileInputStream("file.txt");
      ah = new InflaterInputStream(ag, null);
      ah.available();
    } catch (IOException e) {
    } finally {
      if (ah!= null) ah.close();
    }
  }

  // PushbackInputStream tests

  public void pushbackInputStreamNotClosedAfterRead() {
    FileInputStream fis;
    try {
      fis = new FileInputStream("file.txt");
      PushbackInputStream pms = new PushbackInputStream(fis);
      pms.read();
      pms.close();
    } catch (IOException e) {
    }
    // Mutant
    FileInputStream ai;
    try {
      ai = new FileInputStream("file.txt");
      PushbackInputStream aj = new PushbackInputStream(ai);
      aj.read();
      aj.close();
    } catch (IOException e) {
    }
  }

  public void pushbackInputStreamClosedAfterReset() throws IOException {
    FileInputStream fis;
    PushbackInputStream pms = null;
    try {
      fis = new FileInputStream("file.txt");
      pms = new PushbackInputStream(fis);
      pms.reset();
    } catch (IOException e) {
    } finally {
      if (pms!= null) pms.close();
    }
    // Mutant
    FileInputStream ak;
    PushbackInputStream al = null;
    try {
      ak = new FileInputStream("file.txt");
      al = new PushbackInputStream(ak);
      al.reset();
    } catch (IOException e) {
    } finally {
      if (al!= null) al.close();
    }
  }

  public void twoLevelWrapperNoLeak(File file) throws IOException {
    DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
    in.close();
    // Mutant
    DataInputStream am = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
    am.close();
  }
}