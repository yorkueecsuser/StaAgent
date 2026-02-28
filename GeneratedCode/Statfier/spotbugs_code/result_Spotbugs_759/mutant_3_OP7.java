import java.util.ArrayList;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1759">GitHub issue</a>
 */
class Issue1759 {
  ArrayList<Integer> lst = new ArrayList<Integer>();
  Integer[] res;

  public Integer[] asArray() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
        // Unreachable while loop
        System.out.println("This loop is unreachable");
    }

    res = (Integer[]) ((Object[]) (lst.toArray())); // should report a warning here
    return this.res;
  }

  private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always returns false
  }
}