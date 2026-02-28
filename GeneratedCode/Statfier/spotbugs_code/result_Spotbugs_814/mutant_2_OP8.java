import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class Bug1678225 {
  public void foo(String fileName) {
    InputStream is = null;
    InputStream x = null; // Mutant variable
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
  }

  public void useStream(InputStream is) throws IOException {}

  public void bar(String fileName) {
    InputStream y = null; // Another mutant variable
    try {
      y = new FileInputStream(fileName);
      useStream(y);
      y.close();
    } catch (IOException ex) {
      try {
        y.close();
      } catch (IOException exx) {
        exx.printStackTrace();
      }
      ex.printStackTrace();
    }
  }
}