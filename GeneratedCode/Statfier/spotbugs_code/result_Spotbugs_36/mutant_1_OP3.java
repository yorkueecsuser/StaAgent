import java.util.Iterator;
import java.util.List;

class Bug3330970 {
  public void go(List list) {
    Iterator i = list.iterator();
    while (i.hasNext()) {
      // do something with the stuff in the list
      
      // Unreachable if statement mutant
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() will never return true
        System.out.println("This is an unreachable statement.");
      }
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if block is unreachable
    return false;
  }
}