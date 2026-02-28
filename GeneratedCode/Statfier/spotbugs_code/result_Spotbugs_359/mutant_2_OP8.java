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

  // Mutant code starts here

  private String x; // Renamed 'value' to 'x'

  String getX() {
    return x;
  }

  @CanIgnoreReturnValue
  String returnAVal(String y) { // Renamed 'newValue' to 'y'
    x = y;
    return y;
  }

  String returnAnotheValue(String z) { // Renamed 'newValue' to 'z'
    x = z;
    return z;
  }

  public static String testNoErr() {
    Issue582 q = new Issue582(); // Renamed 'i' to 'q'
    q.returnAVal("foobar");
    return q.getX();
  }

  public static String testWithErr() {
    Issue582 r = new Issue582(); // Renamed 'i' to 'r'
    r.returnAnotheValue("foobar");
    return r.getX();
  }
}