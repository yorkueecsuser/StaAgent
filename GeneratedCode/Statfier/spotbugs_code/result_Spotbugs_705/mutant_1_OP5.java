import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2013_03_15 {

  String a, b;

  public String getA() {
    return a;
  }

  public String getB() {
    return b;
  }

  private Ideas_2013_03_15(String a, String b) {
    this.a = a;
    this.b = b;
  }

  @ExpectWarning("SA")
  public static boolean checkEndsWith(String s, String t) {
    return s.endsWith(s);
  }

  @ExpectWarning("SA")
  public boolean checkEndsWith() {
    return a.endsWith(a);
  }

  @ExpectWarning("SA")
  public static boolean checkStartsWith(String s, String t) {
    return s.startsWith(s);
  }

  @ExpectWarning("SA")
  public boolean checkStartsWith() {
    return a.startsWith(a);
  }

  @ExpectWarning("SA")
  public static boolean checkContains(String s, String t) {
    return s.contains(s);
  }

  @ExpectWarning("SA")
  public boolean checkContains() {
    return a.contains(a);
  }

  @ExpectWarning("SA")
  public static boolean checkEqualsIgnoreCase(String s, String t) {
    return s.equalsIgnoreCase(s);
  }

  @ExpectWarning("SA")
  public boolean checkEqualsIgnoreCase() {
    return a.equalsIgnoreCase(a);
  }

  @ExpectWarning("SA")
  public static int checkCompareToIgnoreCase(String s, String t) {
    return s.compareToIgnoreCase(s);
  }

  @ExpectWarning("SA")
  public int checkCompareToIgnoreCase() {
    return a.compareToIgnoreCase(a);
  }

  // Introduced unreachable switch statement
  private boolean getCondition() {
    return false;
  }

  public void someMethod() {
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getCondition() always returns false
        System.out.println("This will never be printed");
        break;
      default:
        // Default case to avoid unreachable statement error
        break;
    }
  }
}