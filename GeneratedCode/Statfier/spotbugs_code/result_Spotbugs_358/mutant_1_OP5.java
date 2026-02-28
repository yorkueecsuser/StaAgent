import com.google.errorprone.annotations.CanIgnoreReturnValue;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/463">GitHub issue</a>
 */
class Issue463 {
  private String value;

  String getValue() {
    return value;
  }

  @CanIgnoreReturnValue
  String returnAValue(String newValue) {
    value = newValue;
    return newValue;
  }

  String returnAnotherValue(String newValue) {
    value = newValue;
    return newValue;
  }

  public static String testNoError() {
    Issue463 i = new Issue463();
    i.returnAValue("foobar");
    return i.getValue();
  }

  public static String testWithError() {
    Issue463 i = new Issue463();
    i.returnAnotherValue("foobar");
    return i.getValue();
  }

  // Added mutant code for Unreachable switch statement
  private boolean getUnreachableCondition() {
    return false;
  }

  private void addUnreachableSwitch() {
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // This case is unreachable
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case is also unreachable due to the condition always being false
        System.out.println("This is also an unreachable case.");
        break;
    }
  }
}