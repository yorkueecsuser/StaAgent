import java.util.ArrayList;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1759">GitHub issue</a>
 */
class Issue1759 {
  ArrayList<Integer> lst = new ArrayList<Integer>();
  Integer[] res;

  public Integer[] asArray() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable switch case");
        break;
      case 1:
        // This is the only reachable case
        res = (Integer[]) ((Object[]) (lst.toArray())); // should report a warning here
        break;
    }
    return this.res;
  }

  private boolean getCondition() {
    // This method returns false, making the first case of the switch unreachable
    return false;
  }
}