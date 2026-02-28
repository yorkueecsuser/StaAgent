import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/582">GitHub issue</a>
 */
@CheckReturnValue
class Issue582 {
  private String value;

  String getValue() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code block
      value = "unreachable";
    } else {
      // Alternative unreachable code block
      value = "still unreachable";
    }
    return value;
  }

  @CanIgnoreReturnValue
  String returnAValue(String newValue) {
    value = newValue;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code block
      newValue = "unreachable";
    } else {
      // Alternative unreachable code block
      newValue = "still unreachable";
    }
    return newValue;
  }

  String returnAnotherValue(String newValue) {
    value = newValue;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code block
      newValue = "unreachable";
    } else {
      // Alternative unreachable code block
      newValue = "still unreachable";
    }
    return newValue;
  }

  public static String testNoError() {
    Issue582 i = new Issue582();
    i.returnAValue("foobar");
    return i.getValue();
  }

  public static String testWithError() {
    Issue582 i = new Issue582();
    i.returnAnotherValue("foobar");
    return i.getValue();
  }

  private boolean getCondition() {
    // This method ensures that the condition is dynamically determined at runtime
    return false;
  }
}