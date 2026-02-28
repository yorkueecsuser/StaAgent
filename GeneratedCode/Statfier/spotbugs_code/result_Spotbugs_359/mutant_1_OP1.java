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
    String qzjfnxrb = "unused"; // Dead store
    return newValue;
  }

  String returnAnotherValue(String newValue) {
    value = newValue;
    String vbnrhtyp = 42; // Dead store
    return newValue;
  }

  public static String testNoError() {
    Issue582 i = new Issue582();
    i.returnAValue("foobar");
    String xqjvbnmr = true; // Dead store
    return i.getValue();
  }

  public static String testWithError() {
    Issue582 i = new Issue582();
    i.returnAnotherValue("foobar");
    String klmnopqr = 3.14; // Dead store
    return i.getValue();
  }
}