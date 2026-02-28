import com.google.errorprone.annotations.CanIgnoreReturnValue;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/463">GitHub issue</a>
 */
class Issue463 {
  private String value;

  String getValue() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return value;
  }

  @CanIgnoreReturnValue
  String returnAValue(String newValue) {
    value = newValue;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return newValue;
  }

  String returnAnotherValue(String newValue) {
    value = newValue;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return newValue;
  }

  public static String testNoError() {
    Issue463 i = new Issue463();
    i.returnAValue("foobar");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return i.getValue();
  }

  public static String testWithError() {
    Issue463 i = new Issue463();
    i.returnAnotherValue("foobar");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return i.getValue();
  }

  private static boolean getCondition() {
    return false; // This method always returns false, making the while loops unreachable
  }
}