/**
 * @author pugh
 */
class CompareAgainstIntegerMaxValue {

  int report(int x) {
    for (int i = 0; i <= Integer.MAX_VALUE; i++) if (i * i == x) return i;
    return 0;

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor is never set to true
    }
  }

  int report2(int x) {
    if (x < 0 || x > Integer.MAX_VALUE) return -1;
    return x;

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor is never set to true
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the loop remains unreachable
  }
}