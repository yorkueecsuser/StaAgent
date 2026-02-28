import java.util.ArrayList;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1759">GitHub issue</a>
 */
class Issue1759 {
  ArrayList<Integer> lst = new ArrayList<Integer>();
  Integer[] res;

  public Integer[] asArray() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // This switch is unreachable because condition is never true
      case 0:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("This will also never be printed");
        break;
    }

    res = (Integer[]) ((Object[]) (lst.toArray())); // should report a warning here
    return this.res;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the switch unreachable
  }
}