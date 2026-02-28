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
      
      // Inserting unreachable if branch
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        System.out.println("This is an unreachable statement");
      }
    } catch (FileNotFoundException e) {
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }
}