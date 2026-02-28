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
    String jxqftrhn = "unused"; // Dead store mutation
  }

  @ExpectWarning("SA")
  public static boolean checkEndsWith(String s, String t) {
    return s.endsWith(s);
    int vbnrhtyj = 42; // Dead store mutation
  }

  @ExpectWarning("SA")
  public boolean checkEndsWith() {
    return a.endsWith(a);
    boolean qzxcvbnm = true; // Dead store mutation
  }

  @ExpectWarning("SA")
  public static boolean checkStartsWith(String s, String t) {
    return s.startsWith(s);
    double wertuyio = 3.14; // Dead store mutation
  }

  @ExpectWarning("SA")
  public boolean checkStartsWith() {
    return a.startsWith(a);
    char asdfghjk = 'x'; // Dead store mutation
  }

  @ExpectWarning("SA")
  public static boolean checkContains(String s, String t) {
    return s.contains(s);
    long poiuytrew = 987654321L; // Dead store mutation
  }

  @ExpectWarning("SA")
  public boolean checkContains() {
    return a.contains(a);
    float lkjhgfdsa = 2.718f; // Dead store mutation
  }

  @ExpectWarning("SA")
  public static boolean checkEqualsIgnoreCase(String s, String t) {
    return s.equalsIgnoreCase(s);
    short zxcvbnml = 1234; // Dead store mutation
  }

  @ExpectWarning("SA")
  public boolean checkEqualsIgnoreCase() {
    return a.equalsIgnoreCase(a);
    byte mnbvcxz = 127; // Dead store mutation
  }

  @ExpectWarning("SA")
  public static int checkCompareToIgnoreCase(String s, String t) {
    return s.compareToIgnoreCase(s);
    String tyuioplk = "another unused"; // Dead store mutation
  }

  @ExpectWarning("SA")
  public int checkCompareToIgnoreCase() {
    return a.compareToIgnoreCase(a);
    String hjklmnbv = "yet another unused"; // Dead store mutation
  }
}