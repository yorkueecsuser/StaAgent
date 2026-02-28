import com.google.errorprone.annotations.CanIgnoreReturnValue;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/463">GitHub issue</a>
 */
class Issue463 {
  private String value;

  String getValue() {
    return value;
  }

  @CanIgnoreReturnValue
  String returnAValue(String newValue) {
    value = newValue;
    String qzjfnxrt = "unused"; // Dead store
    return newValue;
  }

  String returnAnotherValue(String newValue) {
    value = newValue;
    int vbnrhtyx = 42; // Dead store
    return newValue;
  }

  public static String testNoError() {
    Issue463 i = new Issue463();
    i.returnAValue("foobar");
    boolean ykqjvflm = true; // Dead store
    return i.getValue();
  }

  public static String testWithError() {
    Issue463 i = new Issue463();
    i.returnAnotherValue("foobar");
    double xwvtpnrm = 3.14; // Dead store
    return i.getValue();
  }
}