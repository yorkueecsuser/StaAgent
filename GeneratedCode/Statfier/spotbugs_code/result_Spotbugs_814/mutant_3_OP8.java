import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class Bug1678225 {
  public void foo(String fileName) {
    InputStream is = null;
    try {
      is = new FileInputStream(fileName);
      useStream(is);
      is.close();
    } catch (IOException ex) {
      try {
        is.close();
      } catch (IOException exx) {
        exx.printStackTrace();
      }
      ex.printStackTrace();
    }
    
    // Mutated code with renamed variable
    InputStream a = null;
    try {
      a = new FileInputStream(fileName);
      useStream(a);
      a.close();
    } catch (IOException b) {
      try {
        a.close();
      } catch (IOException c) {
        c.printStackTrace();
      }
      b.printStackTrace();
    }
  }

  public void useStream(InputStream is) throws IOException {}
}