/**
 * @author pugh
 */
class CompareAgainstIntegerMaxValue {

  int report(int x) {
    for (int i = 0; i <= Integer.MAX_VALUE; i++) {
      if (i * i == x) return i;
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is an unreachable if block");
      } else {
        // Unreachable code
        System.out.println("This is an unreachable else block");
      }
    }
    return 0;
  }

  int report2(int x) {
    if (x < 0 || x > Integer.MAX_VALUE) return -1;
    return x;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}