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
    String jxqfhtop; // Dead store
    return newValue;
  }

  String returnAnotherValue(String newValue) {
    value = newValue;
    int abcdefgh; // Dead store
    return newValue;
  }

  public static String testNoError() {
    Issue582 i = new Issue582();
    i.returnAValue("foobar");
    char wxyzabcd; // Dead store
    return i.getValue();
  }

  public static String testWithError() {
    Issue582 i = new Issue582();
    i.returnAnotherValue("foobar");
    boolean rstuvwxy; // Dead store
    return i.getValue();
  }
}