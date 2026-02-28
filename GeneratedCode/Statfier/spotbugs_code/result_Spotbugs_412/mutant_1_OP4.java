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
      
      // Inserted unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will never be printed");
      } else {
        System.out.println("This will also never be printed");
      }
    } catch (FileNotFoundException e) {
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}