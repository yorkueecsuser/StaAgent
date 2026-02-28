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
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because getCondition() always returns false
    }
    return i.getValue();
  }

  public static String testWithError() {
    Issue582 i = new Issue582();
    i.returnAnotherValue("foobar");
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) {
      // This loop is unreachable because getCondition() always returns false
    }
    return i.getValue();
  }

  private static boolean getCondition() {
    return false;
  }
}