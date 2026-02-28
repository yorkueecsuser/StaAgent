/**
 * @author pugh
 */
class CompareAgainstIntegerMaxValue {

  int report(int x) {
    for (int i = 0; i <= Integer.MAX_VALUE; i++) {
      if (i * i == x) return i;
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        // This block is unreachable because getCondition() always returns false
        System.out.println("This is an unreachable statement.");
      }
    }
    return 0;
  }

  int report2(int x) {
    if (x < 0 || x > Integer.MAX_VALUE) return -1;
    return x;
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if statement is unreachable
    return false;
  }
}