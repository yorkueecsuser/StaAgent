import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

class DontBeMalicious {

  static final HashMap myMap = new HashMap();

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
  }

  public void lazyMethod() {
    try {
      BufferedReader x = new BufferedReader(new FileReader("HelloHello"));
      
      // Inserting unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() always returns false
        System.out.println("This will never be printed");
      }
    } catch (FileNotFoundException e) {
    }
  }

  private boolean getCondition() {
    return false;
  }
}