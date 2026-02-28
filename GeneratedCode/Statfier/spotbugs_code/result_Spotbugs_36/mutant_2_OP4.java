import java.util.Iterator;
import java.util.List;

class Bug3330970 {
  public void go(List list) {
    Iterator i = list.iterator();
    while (i.hasNext()) {
      // do something with the stuff in the list
      
      // Mutant code start
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        System.out.println("This is an unreachable if block");
      } else {
        // This block will also never execute because shouldRun is always false
        System.out.println("This is an unreachable else block");
      }
      // Mutant code end
    }
  }

  private boolean getCondition() {
    return false;
  }
}