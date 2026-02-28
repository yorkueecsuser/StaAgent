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
    return i.getValue();
  }

  public static String testWithError() {
    Issue582 i = new Issue582();
    i.returnAnotherValue("foobar");
    return i.getValue();
  }

  // Added mutant code with an unreachable switch statement
  private boolean getUnreachableCondition() {
    return false;
  }

  private void addUnreachableSwitch() {
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable code.");
        break;
      default:
        System.out.println("This is also unreachable code.");
        break;
    }
  }
}