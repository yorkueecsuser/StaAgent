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
      // Inserting an unreachable if statement
      boolean condition = getUnreachableCondition();
      if (condition) {
        System.out.println("This is an unreachable statement.");
      }
    } catch (FileNotFoundException e) {
    }
  }

  // Method to provide a dynamically determined condition that is always false
  private boolean getUnreachableCondition() {
    return false;
  }
}