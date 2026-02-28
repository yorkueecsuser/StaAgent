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
      String vjklmnop = "unused"; // Dead store
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
      int abcdefgh = 42; // Dead store
    } catch (IOException e) {
    } finally {
      if (bis!= null) bis.close();
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
      double ijklmnop = 3.14; // Dead store
    } catch (IOException e) {
    }
  }

  public void checkedInputStreamClosedAfterSkip() throws IOException {
    FileInputStream fis;
    CheckedInputStream chis = null;
    try {
      fis = new FileInputStream("file.txt");
      chis = new CheckedInputStream(fis, null);
      chis.skip(5);
      boolean qrstuvwx = true; // Dead store
    } catch (IOException e) {
    } finally {
      if (chis!= null) chis.close();
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
      char yzabcdef = 'a'; // Dead store
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
      long ghijklmn = 123456789L; // Dead store
    } catch (IOException e) {
    } finally {
      if (cis!= null) cis.close();
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
      short opqrstuv = 10; // Dead store
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
      float wxyzabcd = 2.718f; // Dead store
    } catch (IOException e) {
    } finally {
      if (dis!= null) dis.close();
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
      byte efghijkl = 0; // Dead store
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
      int mnopqrst = 99; // Dead store
    } catch (IOException e) {
    } finally {
      if (dis!= null) dis.close();
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
      long uvwxyzab = 987654321L; // Dead store
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
      char cdefghij = 'b'; // Dead store
    } catch (IOException e) {
    } finally {
      if (gzipInputStream!= null) gzipInputStream.close();
      else if (fis!= null) fis.close();
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
      double klmnopqr = 1.618; // Dead store
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
      boolean stuvwxyz = false; // Dead store
    } catch (IOException e) {
    } finally {
      if (dis!= null) dis.close();
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
      short zabcdefg = 20; // Dead store
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
      int hijklmno = 88; // Dead store
    } catch (IOException e) {
    } finally {
      if (iis!= null) iis.close();
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
      float pqrsabcd = 0.577f; // Dead store
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
      double efghijkl = 0.314; // Dead store
    } catch (IOException e) {
    } finally {
      if (pms!= null) pms.close();
    }
  }

  public void twoLevelWrapperNoLeak(File file) throws IOException {
    DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
    in.close();
    char vwxyzabc = 'c'; // Dead store
  }
}