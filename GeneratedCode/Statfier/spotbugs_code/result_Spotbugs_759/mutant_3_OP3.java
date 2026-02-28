import java.util.ArrayList;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1759">GitHub issue</a>
 */
class Issue1759 {
  ArrayList<Integer> lst = new ArrayList<Integer>();
  Integer[] res;

  public Integer[] asArray() {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable because getUnreachableCondition() always returns false
      System.out.println("This is an unreachable block");
    }
    res = (Integer[]) ((Object[]) (lst.toArray())); // should report a warning here
    return this.res;
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}