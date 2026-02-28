import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Ideas_2011_06_16 {

  public static byte[] getByteFile(String byteFileName, int n) {
    File f = new File(byteFileName);

    if (!(f.exists() && f.isFile() && f.canRead() && f.length() == n)) return null;

    FileInputStream fs;

    try {
      fs = new FileInputStream(f);
    } catch (FileNotFoundException e) {
      return null;
    }

    byte[] bytes = new byte[n];

    int numBytesRead = 0;

    try {
      numBytesRead = fs.read(bytes);
      fs.close();
    } catch (IOException e) {
      return null;
    }

    if (numBytesRead!= n) return null;

    return bytes;
  } // end getByteFile

  public static byte[] getByteFileFixed(String byteFileName, int n) {
    File f = new File(byteFileName);

    if (!(f.exists() && f.isFile() && f.canRead() && f.length() == n)) return null;

    DataInputStream ds;

    try {
      ds = new DataInputStream(new FileInputStream(f));
    } catch (FileNotFoundException e) {
      return null;
    }

    try {
      byte[] bytes = new byte[n];
      ds.readFully(bytes);
      return bytes;
    } catch (IOException e) {
      return null;
    } finally {
      try {
        ds.close();
      } catch (IOException e) {
        assert true; // nothing to do at this point
      }
    }
  } // end getByteFile

  static int firstByte(File f) throws IOException {
    FileInputStream fs;

    try {
      fs = new FileInputStream(f);
    } catch (FileNotFoundException e) {
      return -1;
    }
    try {
      return fs.read();
    } catch (IOException e) {
      return -2;
    } finally {
      fs.close();
    }
  }

  // Mutated Code
  public static byte[] getByteFileMutated(String byteFileName, int m) {
    File g = new File(byteFileName);

    if (!(g.exists() && g.isFile() && g.canRead() && g.length() == m)) return null;

    FileInputStream h;

    try {
      h = new FileInputStream(g);
    } catch (FileNotFoundException e) {
      return null;
    }

    byte[] bytes = new byte[m];

    int numBytesRead = 0;

    try {
      numBytesRead = h.read(bytes);
      h.close();
    } catch (IOException e) {
      return null;
    }

    if (numBytesRead!= m) return null;

    return bytes;
  } // end getByteFileMutated

  public static byte[] getByteFileFixedMutated(String byteFileName, int p) {
    File q = new File(byteFileName);

    if (!(q.exists() && q.isFile() && q.canRead() && q.length() == p)) return null;

    DataInputStream r;

    try {
      r = new DataInputStream(new FileInputStream(q));
    } catch (FileNotFoundException e) {
      return null;
    }

    try {
      byte[] bytes = new byte[p];
      r.readFully(bytes);
      return bytes;
    } catch (IOException e) {
      return null;
    } finally {
      try {
        r.close();
      } catch (IOException e) {
        assert true; // nothing to do at this point
      }
    }
  } // end getByteFileFixedMutated

  static int firstByteMutated(File s) throws IOException {
    FileInputStream t;

    try {
      t = new FileInputStream(s);
    } catch (FileNotFoundException e) {
      return -1;
    }
    try {
      return t.read();
    } catch (IOException e) {
      return -2;
    } finally {
      t.close();
    }
  }
}