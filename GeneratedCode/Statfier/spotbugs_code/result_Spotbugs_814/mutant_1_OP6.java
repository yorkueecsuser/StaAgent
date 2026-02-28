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
      
      // Inserting unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor is always false
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

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}