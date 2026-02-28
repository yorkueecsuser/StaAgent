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

  // Mutated code
  private String x;

  String getX() {
    return x;
  }

  @CanIgnoreReturnValue
  String returnAValue(String n) {
    x = n;
    return n;
  }

  String returnAnotherValue(String m) {
    x = m;
    return m;
  }

  public static String testNoErrorMutant() {
    Issue582 j = new Issue582();
    j.returnAValue("foobar");
    return j.getX();
  }

  public static String testWithErrorMutant() {
    Issue582 j = new Issue582();
    j.returnAnotherValue("foobar");
    return j.getX();
  }
}