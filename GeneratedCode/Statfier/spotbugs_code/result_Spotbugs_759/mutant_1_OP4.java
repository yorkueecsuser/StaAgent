import java.util.ArrayList;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1759">GitHub issue</a>
 */
class Issue1759 {
  ArrayList<Integer> lst = new ArrayList<Integer>();
  Integer[] res;

  public Integer[] asArray() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some placeholder code that will never execute due to the condition
      System.out.println("This is a placeholder message that should never be printed.");
    } else {
      // Another placeholder code that will also never execute due to the condition
      System.out.println("This is another placeholder message that should never be printed.");
    }
    
    res = (Integer[]) ((Object[]) (lst.toArray())); // should report a warning here
    return this.res;
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else branches unreachable
    return false;
  }
}