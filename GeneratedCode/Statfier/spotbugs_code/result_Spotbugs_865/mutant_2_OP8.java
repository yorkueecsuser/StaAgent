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

  // Mutated code
  public static byte[] getByteFileMutant(String byteFileName, int m) {
    File g = new File(byteFileName);

    if (!(g.exists() && g.isFile() && g.canRead() && g.length() == m)) return null;

    FileInputStream h;

    try {
      h = new FileInputStream(g);
    } catch (FileNotFoundException e) {
      return null;
    }

    byte[] c = new byte[m];

    int numBytesRead = 0;

    try {
      numBytesRead = h.read(c);
      h.close();
    } catch (IOException e) {
      return null;
    }

    if (numBytesRead!= m) return null;

    return c;
  } // end getByteFileMutant

  public static byte[] getByteFileFixedMutant(String byteFileName, int m) {
    File g = new File(byteFileName);

    if (!(g.exists() && g.isFile() && g.canRead() && g.length() == m)) return null;

    DataInputStream i;

    try {
      i = new DataInputStream(new FileInputStream(g));
    } catch (FileNotFoundException e) {
      return null;
    }

    try {
      byte[] c = new byte[m];
      i.readFully(c);
      return c;
    } catch (IOException e) {
      return null;
    } finally {
      try {
        i.close();
      } catch (IOException e) {
        assert true; // nothing to do at this point
      }
    }
  } // end getByteFileFixedMutant

  static int firstByteMutant(File g) throws IOException {
    FileInputStream h;

    try {
      h = new FileInputStream(g);
    } catch (FileNotFoundException e) {
      return -1;
    }
    try {
      return h.read();
    } catch (IOException e) {
      return -2;
    } finally {
      h.close();
    }
  }
}