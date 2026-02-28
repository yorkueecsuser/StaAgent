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
      
      // Mutant code start
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        System.out.println("This is an unreachable if block.");
      } else {
        // This block will also never execute because shouldRun is always false
        System.out.println("This is an unreachable else block.");
      }
      // Mutant code end
    } catch (FileNotFoundException e) {
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else is unreachable
  }
}