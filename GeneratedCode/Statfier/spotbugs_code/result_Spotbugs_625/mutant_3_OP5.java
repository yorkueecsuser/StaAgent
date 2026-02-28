/**
 * @author pugh
 */
class CompareAgainstIntegerMaxValue {

  int report(int x) {
    for (int i = 0; i <= Integer.MAX_VALUE; i++) if (i * i == x) return i;
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case.");
        break;
    }
    return 0;
  }

  int report2(int x) {
    if (x < 0 || x > Integer.MAX_VALUE) return -1;
    return x;
  }

  // Method to provide a dynamic condition that always evaluates to false
  private boolean getCondition() {
    return false;
  }
}