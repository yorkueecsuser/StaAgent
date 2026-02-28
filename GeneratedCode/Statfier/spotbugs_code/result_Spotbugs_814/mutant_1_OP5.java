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
      
      // Unreachable switch statement
      boolean condition = getCondition();
      switch(condition) {
        case true:
          System.out.println("This is unreachable");
          break;
        default:
          System.out.println("Default case");
          break;
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
    return false; // This ensures the switch is unreachable
  }
}