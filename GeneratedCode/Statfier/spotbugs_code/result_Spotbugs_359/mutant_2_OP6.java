import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/582">GitHub issue</a>
 */
@CheckReturnValue
class Issue582 {
  private String value;

  String getValue() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() always returns false
    }
    return value;
  }

  @CanIgnoreReturnValue
  String returnAValue(String newValue) {
    value = newValue;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() always returns false
    }
    return newValue;
  }

  String returnAnotherValue(String newValue) {
    value = newValue;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() always returns false
    }
    return newValue;
  }

  public static String testNoError() {
    Issue582 i = new Issue582();
    i.returnAValue("foobar");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() always returns false
    }
    return i.getValue();
  }

  public static String testWithError() {
    Issue582 i = new Issue582();
    i.returnAnotherValue("foobar");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() always returns false
    }
    return i.getValue();
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the loop is unreachable
  }
}