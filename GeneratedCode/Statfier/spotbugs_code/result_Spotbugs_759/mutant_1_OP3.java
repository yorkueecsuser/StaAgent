import java.util.ArrayList;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1759">GitHub issue</a>
 */
class Issue1759 {
  ArrayList<Integer> lst = new ArrayList<Integer>();
  Integer[] res;

  public Integer[] asArray() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement because getCondition() will never return true
      System.out.println("This will never be printed");
    }
    res = (Integer[]) ((Object[]) (lst.toArray())); // should report a warning here
    return this.res;
  }

  private boolean getCondition() {
    // This method is designed to always return false, making the if statement unreachable
    return false;
  }
}