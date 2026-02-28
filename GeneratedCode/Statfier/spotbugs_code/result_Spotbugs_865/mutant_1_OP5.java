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

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case");
        break;
    }

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

      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("This is an unreachable case");
          break;
      }
    }
  }

  private static boolean getCondition() {
    return false;
  }
}