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
        // This block is reachable if shouldRun is true
        System.out.println("This is a reachable block.");
      } else {
        // This block is unreachable because shouldRun is always false
        System.out.println("This is an unreachable block.");
      }
      // Mutant code end
      
    } catch (FileNotFoundException e) {
    }
  }

  private boolean getCondition() {
    // Always returns false to make the else block unreachable
    return false;
  }
}