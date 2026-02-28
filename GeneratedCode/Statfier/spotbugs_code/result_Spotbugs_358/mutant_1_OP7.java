import com.google.errorprone.annotations.CanIgnoreReturnValue;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/463">GitHub issue</a>
 */
class Issue463 {
  private String value;

  String getValue() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    return value;
  }

  @CanIgnoreReturnValue
  String returnAValue(String newValue) {
    value = newValue;
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    return newValue;
  }

  String returnAnotherValue(String newValue) {
    value = newValue;
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    return newValue;
  }

  public static String testNoError() {
    Issue463 i = new Issue463();
    i.returnAValue("foobar");
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    return i.getValue();
  }

  public static String testWithError() {
    Issue463 i = new Issue463();
    i.returnAnotherValue("foobar");
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    return i.getValue();
  }

  // Helper method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}