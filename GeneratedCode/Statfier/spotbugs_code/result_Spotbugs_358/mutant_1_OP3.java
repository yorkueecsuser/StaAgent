import com.google.errorprone.annotations.CanIgnoreReturnValue;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/463">GitHub issue</a>
 */
class Issue463 {
  private String value;

  String getValue() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      value = "unreachable";
    }
    return value;
  }

  @CanIgnoreReturnValue
  String returnAValue(String newValue) {
    value = newValue;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      newValue = "unreachable";
    }
    return newValue;
  }

  String returnAnotherValue(String newValue) {
    value = newValue;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      newValue = "unreachable";
    }
    return newValue;
  }

  public static String testNoError() {
    Issue463 i = new Issue463();
    i.returnAValue("foobar");
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return "unreachable";
    }
    return i.getValue();
  }

  public static String testWithError() {
    Issue463 i = new Issue463();
    i.returnAnotherValue("foobar");
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return "unreachable";
    }
    return i.getValue();
  }

  private static boolean getCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }
}