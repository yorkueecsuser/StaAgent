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

  // Mutated code starts here
  private boolean getCondition() {
    return false;
  }

  String getValueWithUnreachableIfElse() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      value = "unreachable";
    } else {
      value = "also unreachable";
    }
    return value;
  }

  String returnAValueWithUnreachableIfElse(String newValue) {
    value = newValue;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return "unreachable";
    } else {
      return "also unreachable";
    }
    return newValue;
  }

  String returnAnotherValueWithUnreachableIfElse(String newValue) {
    value = newValue;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return "unreachable";
    } else {
      return "also unreachable";
    }
    return newValue;
  }

  public static String testNoErrorWithUnreachableIfElse() {
    Issue463 i = new Issue463();
    i.returnAValueWithUnreachableIfElse("foobar");
    return i.getValueWithUnreachableIfElse();
  }

  public static String testWithErrorWithUnreachableIfElse() {
    Issue463 i = new Issue463();
    i.returnAnotherValueWithUnreachableIfElse("foobar");
    return i.getValueWithUnreachableIfElse();
  }
}