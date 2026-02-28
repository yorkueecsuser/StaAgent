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

  // Mutated code starts here

  private String x; // Renamed 'value' to 'x'

  String getZ() { // Renamed 'getValue' to 'getZ'
    return x;
  }

  @CanIgnoreReturnValue
  String y(String newValue) { // Renamed'returnAValue' to 'y'
    x = newValue;
    return newValue;
  }

  String z(String newValue) { // Renamed'returnAnotherValue' to 'z'
    x = newValue;
    return newValue;
  }

  public static String a() { // Renamed 'testNoError' to 'a'
    Issue463 q = new Issue463(); // Renamed 'i' to 'q'
    q.y("foobar");
    return q.getZ();
  }

  public static String b() { // Renamed 'testWithError' to 'b'
    Issue463 r = new Issue463(); // Renamed 'i' to 'r'
    r.z("foobar");
    return r.getZ();
  }
}