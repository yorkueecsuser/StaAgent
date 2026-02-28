/**
 * @author pugh
 */
class CompareAgainstIntegerMaxValue {

  int report(int x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    for (int i = 0; i <= Integer.MAX_VALUE; i++) if (i * i == x) return i;
    return 0;
  }

  int report2(int x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is another unreachable statement");
    }
    if (x < 0 || x > Integer.MAX_VALUE) return -1;
    return x;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}