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
      fs = new FileInputStream(f); // Mutant: Duplicate assignment
    } catch (FileNotFoundException e) {
      return null;
    }

    byte[] bytes = new byte[n];
    byte[] bytesCopy = new byte[n]; // Mutant: Duplicate declaration

    int numBytesRead = 0;
    int numBytesReadCopy = 0; // Mutant: Duplicate declaration

    try {
      numBytesRead = fs.read(bytes);
      numBytesRead = fs.read(bytes); // Mutant: Duplicate assignment
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
      ds = new DataInputStream(new FileInputStream(f)); // Mutant: Duplicate assignment
    } catch (FileNotFoundException e) {
      return null;
    }

    try {
      byte[] bytes = new byte[n];
      byte[] bytesCopy = new byte[n]; // Mutant: Duplicate declaration
      ds.readFully(bytes);
      ds.readFully(bytes); // Mutant: Duplicate method call, but not an assignment
      return bytes;
    } catch (IOException e) {
      return null;
    } finally {
      try {
        ds.close();
        ds.close(); // Mutant: Duplicate assignment (method call)
      } catch (IOException e) {
        assert true; // nothing to do at this point
      }
    }
  } // end getByteFile

  static int firstByte(File f) throws IOException {
    FileInputStream fs;

    try {
      fs = new FileInputStream(f);
      fs = new FileInputStream(f); // Mutant: Duplicate assignment
    } catch (FileNotFoundException e) {
      return -1;
    }
    try {
      return fs.read();
    } catch (IOException e) {
      return -2;
    } finally {
      fs.close();
      fs.close(); // Mutant: Duplicate assignment (method call)
    }
  }
}