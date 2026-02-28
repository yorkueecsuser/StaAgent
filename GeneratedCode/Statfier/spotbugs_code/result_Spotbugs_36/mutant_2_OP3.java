import java.util.Iterator;
import java.util.List;

class Bug3330970 {
  public void go(List list) {
    Iterator i = list.iterator();
    while (i.hasNext()) {
      // do something with the stuff in the list
      
      // Mutant code: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        System.out.println("This is an unreachable statement.");
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}