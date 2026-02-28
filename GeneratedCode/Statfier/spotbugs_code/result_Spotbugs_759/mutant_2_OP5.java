import java.util.ArrayList;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1759">GitHub issue</a>
 */
class Issue1759 {
  ArrayList<Integer> lst = new ArrayList<Integer>();
  Integer[] res;

  public Integer[] asArray() {
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case true:
        // This case will never be executed because unreachableCondition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // This is the default case that will always be executed
        res = (Integer[]) ((Object[]) (lst.toArray())); // should report a warning here
        break;
    }
    return this.res;
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}