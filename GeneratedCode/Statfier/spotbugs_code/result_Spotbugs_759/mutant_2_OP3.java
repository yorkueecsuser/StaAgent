import java.util.ArrayList;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1759">GitHub issue</a>
 */
class Issue1759 {
  ArrayList<Integer> lst = new ArrayList<Integer>();
  Integer[] res;

  public Integer[] asArray() {
    boolean condition = getCondition(); // Non-final variable to avoid compile-time constant
    if (condition) { // Unreachable if statement
      // This block should never be executed
      System.out.println("This is an unreachable block.");
    }
    
    res = (Integer[]) ((Object[]) (lst.toArray())); // should report a warning here
    return this.res;
  }

  private boolean getCondition() {
    return false; // Method to return a dynamic condition
  }
}