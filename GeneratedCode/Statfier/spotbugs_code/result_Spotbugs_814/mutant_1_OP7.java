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
      
      // Inserting an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because conditionWhile will always be false
        System.out.println("This loop is unreachable");
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

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}