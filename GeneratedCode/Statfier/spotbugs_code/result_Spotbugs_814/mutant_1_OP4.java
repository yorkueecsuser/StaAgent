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
      // Inserted unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will never run");
      } else {
        System.out.println("This will also never run");
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

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the if-else block unreachable
  }
}