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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
    }
  }

  public void twoLevelWrapperNoLeak(File file) throws IOException {
    DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
    in.close();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable code.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}