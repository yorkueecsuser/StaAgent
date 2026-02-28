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

  String getx() {
    return x;
  }

  @CanIgnoreReturnValue
  String returnAx(String b) {
    x = b;
    return b;
  }

  String returnAnotherx(String c) {
    x = c;
    return c;
  }

  public static String testNoErrorMutant() {
    Issue582 j = new Issue582();
    j.returnAx("foobar");
    return j.getx();
  }

  public static String testWithErrorMutant() {
    Issue582 k = new Issue582();
    k.returnAnotherx("foobar");
    return k.getx();
  }
}