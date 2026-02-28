import java.util.Iterator;
import java.util.List;

class Bug3330970 {
  public void go(List list) {
    Iterator i = list.iterator();
    while (i.hasNext()) {
      // do something with the stuff in the list
    }

    // Introduced unreachable while loop
    boolean conditionWhile = getUnreachableCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}