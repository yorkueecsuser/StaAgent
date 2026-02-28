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
      String qvbnrhty = "deadstore"; // Dead Store Mutation
    } catch (IOException e) {
    }
  }

  public void filterOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream fis;
    FilterOutputStream fos = null;
    try {
      fis = new FileOutputStream("file.txt");
      fos = new FilterOutputStream(fis);
      fos.write(arr);
    } catch (IOException e) {
    } finally {
      if (fos!= null) fos.close();
      int kxjvbnrt = 42; // Dead Store Mutation
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
      boolean mnbvcxzp = true; // Dead Store Mutation
    } catch (IOException e) {
    }
  }

  public void dataOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream fis;
    DataOutputStream dos = null;
    try {
      fis = new FileOutputStream("file.txt");
      dos = new DataOutputStream(fis);
      dos.write(arr);
    } catch (IOException e) {
    } finally {
      if (dos!= null) dos.close();
      double wertuyio = 3.14; // Dead Store Mutation
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
      char asdfghjk = 'a'; // Dead Store Mutation
    } catch (IOException e) {
    }
  }

  public void bufferedOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream fis;
    BufferedOutputStream bos = null;
    try {
      fis = new FileOutputStream("file.txt");
      bos = new BufferedOutputStream(fis);
      bos.write(arr);
    } catch (IOException e) {
    } finally {
      if (bos!= null) bos.close();
      long zxcvbnml = 987654321; // Dead Store Mutation
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
      float poiuytrew = 1.23f; // Dead Store Mutation
    } catch (IOException e) {
    }
  }

  public void checkedOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream fis;
    CheckedOutputStream chos = null;
    try {
      fis = new FileOutputStream("file.txt");
      chos = new CheckedOutputStream(fis, null);
      chos.write(arr);
    } catch (IOException e) {
    } finally {
      if (chos!= null) chos.close();
      short qwertyui = 12345; // Dead Store Mutation
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
      byte hjklpoiuyt = 0x1A; // Dead Store Mutation
    } catch (IOException e) {
    }
  }

  public void cipherOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream fis;
    CipherOutputStream cos = null;
    try {
      fis = new FileOutputStream("file.txt");
      cos = new CipherOutputStream(fis, null);
      cos.write(arr);
    } catch (IOException e) {
    } finally {
      if (cos!= null) cos.close();
      String asdfghjkl = "mutation"; // Dead Store Mutation
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
      int lkjhgfdsa = 999; // Dead Store Mutation
    } catch (IOException e) {
    }
  }

  public void deflaterOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream fis;
    DeflaterOutputStream dos = null;
    try {
      fis = new FileOutputStream("file.txt");
      dos = new DeflaterOutputStream(fis, null);
      dos.write(arr);
    } catch (IOException e) {
    } finally {
      if (dos!= null) dos.close();
      boolean zxcvbnmk = false; // Dead Store Mutation
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
      double qwertyuiop = 2.718; // Dead Store Mutation
    } catch (IOException e) {
    }
  }

  public void digestOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream fis;
    DigestOutputStream dos = null;
    try {
      fis = new FileOutputStream("file.txt");
      dos = new DigestOutputStream(fis, null);
      dos.write(arr);
    } catch (IOException e) {
    } finally {
      if (dos!= null) dos.close();
      char mnbvcxzlkj = 'b'; // Dead Store Mutation
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
      long lkjhgfdsapoiuytrew = 123456789L; // Dead Store Mutation
    } catch (IOException e) {
    }
  }

  public void inflaterOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream fis;
    InflaterOutputStream ios = null;
    try {
      fis = new FileOutputStream("file.txt");
      ios = new InflaterOutputStream(fis, null);
      ios.write(arr);
    } catch (IOException e) {
    } finally {
      if (ios!= null) ios.close();
      float asdfghjklpoiuytrew = 0.577f; // Dead Store Mutation
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
      String poiuytrewq = "mutate"; // Dead Store Mutation
    } catch (IOException e) {
    }
  }

  public void gzipOutputStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream fos = null;
    GZIPOutputStream gzipOutputStream = null;
    try {
      fos = new FileOutputStream("file.txt");
      gzipOutputStream = new GZIPOutputStream(fos);
      gzipOutputStream.write(arr);
    } catch (IOException e) {
    } finally {
      if (gzipOutputStream!= null) gzipOutputStream.close();
      else if (fos!= null) fos.close();
      char lkjhgfdsa = 'c'; // Dead Store Mutation
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
      short poiuytrewq = 6789; // Dead Store Mutation
    } catch (IOException e) {
    }
  }

  public void printStreamClosedAfterWrite() throws IOException {
    byte[] arr = {1, 2, 3};
    FileOutputStream fis;
    InflaterOutputStream printer = null;
    try {
      fis = new FileOutputStream("file.txt");
      printer = new InflaterOutputStream(fis, null);
      printer.write(arr);
    } catch (IOException e) {
    } finally {
      if (printer!= null) printer.close();
      double lkjhgfdsa = 1.618; // Dead Store Mutation
    }
  }
}