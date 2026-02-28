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
      bis = new BufferedInputStream(fis); // Mutant
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
      if (bis!= null) bis = new BufferedInputStream(fis); // Mutant
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
      chis = new CheckedInputStream(fis, null); // Mutant
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
    } catch (IOException e) {
    } finally {
      if (chis!= null) chis.close();
      if (chis!= null) chis = new CheckedInputStream(fis, null); // Mutant
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
      cis = new CipherInputStream(fis, null); // Mutant
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
      if (cis!= null) cis = new CipherInputStream(fis, null); // Mutant
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
      dis = new DataInputStream(fis); // Mutant
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
      if (dis!= null) dis = new DataInputStream(fis); // Mutant
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
      dis = new DeflaterInputStream(fis, null); // Mutant
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
      if (dis!= null) dis = new DeflaterInputStream(fis, null); // Mutant
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
      gzipInputStream = new GZIPInputStream(fis); // Mutant
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
      if (gzipInputStream!= null) gzipInputStream = new GZIPInputStream(fis); // Mutant
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
      dis = new DigestInputStream(fis, null); // Mutant
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
      if (dis!= null) dis = new DigestInputStream(fis, null); // Mutant
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
      iis = new InflaterInputStream(fis, null); // Mutant
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
      if (iis!= null) iis = new InflaterInputStream(fis, null); // Mutant
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
      pms = new PushbackInputStream(fis); // Mutant
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
      if (pms!= null) pms = new PushbackInputStream(fis); // Mutant
    }
  }

  public void twoLevelWrapperNoLeak(File file) throws IOException {
    DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
    in.close();
    in = new DataInputStream(new BufferedInputStream(new FileInputStream(file))); // Mutant
  }
}