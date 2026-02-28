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
    return i.getValue();
  }

  public static String testWithError() {
    Issue463 i = new Issue463();
    i.returnAnotherValue("foobar");
    return i.getValue();
  }

  // Mutated code
  private String x;

  String getX() {
    return x;
  }

  @CanIgnoreReturnValue
  String returnBValue(String bnewValue) {
    x = bnewValue;
    return bnewValue;
  }

  String returnCValue(String cnewValue) {
    x = cnewValue;
    return cnewValue;
  }

  public static String testNoErrorMutant() {
    Issue463 z = new Issue463();
    z.returnBValue("foobar");
    return z.getX();
  }

  public static String testWithErrorMutant() {
    Issue463 y = new Issue463();
    y.returnCValue("foobar");
    return y.getX();
  }
}