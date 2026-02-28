import java.util.Comparator;

class Comparador implements Comparator {

  /**
   * @param args
   */
  public static void main(String[] args) {}

  @Override
  public int compare(Object arg0, Object arg1) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      return arg0.hashCode() - arg1.hashCode();
    } else {
      // This is an unreachable block due to the condition always being false
      return arg1.hashCode() - arg0.hashCode();
    }
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false;
  }
}