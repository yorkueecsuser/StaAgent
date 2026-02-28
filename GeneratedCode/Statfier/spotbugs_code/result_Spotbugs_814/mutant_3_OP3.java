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
      // Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable branch");
      }
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

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}