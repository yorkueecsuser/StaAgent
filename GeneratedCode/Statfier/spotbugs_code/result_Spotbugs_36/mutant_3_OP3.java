import java.util.Iterator;
import java.util.List;

class Bug3330970 {
  public void go(List list) {
    Iterator i = list.iterator();
    while (i.hasNext()) {
      // do something with the stuff in the list
      
      // Unreachable if statement mutation
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        System.out.println("This is an unreachable statement");
      }
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }
}