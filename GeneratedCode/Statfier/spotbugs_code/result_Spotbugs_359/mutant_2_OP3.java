import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/582">GitHub issue</a>
 */
@CheckReturnValue
class Issue582 {
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
    // This method returns false, ensuring the if statements are unreachable
    return false;
  }
}