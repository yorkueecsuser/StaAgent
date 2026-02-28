/**
 * @author pugh
 */
class CompareAgainstIntegerMaxValue {

  int report(int x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        System.out.println("This is an unreachable statement");
      } else {
        System.out.println("This is also an unreachable statement");
      }
    }
    for (int i = 0; i <= Integer.MAX_VALUE; i++) if (i * i == x) return i;
    return 0;
  }

  int report2(int x) {
    if (x < 0 || x > Integer.MAX_VALUE) return -1;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        System.out.println("This is an unreachable statement");
      } else {
        System.out.println("This is also an unreachable statement");
      }
    }
    return x;
  }

  private boolean getCondition() {
    return true; // This can be any dynamic condition
  }

  private boolean getFalseCondition() {
    return false; // This will always be false, but it's not a compile-time constant
  }
}