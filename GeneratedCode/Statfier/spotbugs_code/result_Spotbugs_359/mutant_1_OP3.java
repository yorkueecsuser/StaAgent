import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/582">GitHub issue</a>
 */
@CheckReturnValue
class Issue582 {
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
    Issue582 i = new Issue582();
    i.returnAValue("foobar");
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      i.value = "unreachable";
    }
    return i.getValue();
  }

  public static String testWithError() {
    Issue582 i = new Issue582();
    i.returnAnotherValue("foobar");
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      i.value = "unreachable";
    }
    return i.getValue();
  }

  private static boolean getCondition() {
    // This method always returns false, making the if branch unreachable
    return false;
  }
}