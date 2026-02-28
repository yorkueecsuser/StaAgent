/**
 * @author pugh
 */
class CompareAgainstIntegerMaxValue {

  int report(int x) {
    for (int i = 0; i <= Integer.MAX_VALUE; i++) if (i * i == x) return i;
    return 0;

    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor will always be false at runtime
    }
  }

  int report2(int x) {
    if (x < 0 || x > Integer.MAX_VALUE) return -1;
    return x;

    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor will always be false at runtime
    }
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is dynamically determined at runtime
  }
}