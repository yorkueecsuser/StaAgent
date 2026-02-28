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
    return newValue;
  }

  String returnAnotherValue(String newValue) {
    value = newValue;
    return newValue;
  }

  public static String testNoError() {
    Issue463 i = new Issue463();
    i.returnAValue("foobar");
    String qzjxflrt = "unused"; // Dead store
    return i.getValue();
  }

  public static String testWithError() {
    Issue463 i = new Issue463();
    i.returnAnotherValue("foobar");
    int vbnrhtyx = 42; // Dead store
    return i.getValue();
  }
}