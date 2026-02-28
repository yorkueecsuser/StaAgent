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
    String qvbnrhty = "unused"; // Dead Store
  }

  @ExpectWarning("SA")
  public static boolean checkEndsWith(String s, String t) {
    return s.endsWith(s);
    int jkfldmno = 42; // Dead Store
  }

  @ExpectWarning("SA")
  public boolean checkEndsWith() {
    return a.endsWith(a);
    boolean pqwertyu = true; // Dead Store
  }

  @ExpectWarning("SA")
  public static boolean checkStartsWith(String s, String t) {
    return s.startsWith(s);
    double asdfghjk = 3.14; // Dead Store
  }

  @ExpectWarning("SA")
  public boolean checkStartsWith() {
    return a.startsWith(a);
    char zxcvbnml = 'x'; // Dead Store
  }

  @ExpectWarning("SA")
  public static boolean checkContains(String s, String t) {
    return s.contains(s);
    long qwertyui = 123456789L; // Dead Store
  }

  @ExpectWarning("SA")
  public boolean checkContains() {
    return a.contains(a);
    float poiuytrew = 2.718f; // Dead Store
  }

  @ExpectWarning("SA")
  public static boolean checkEqualsIgnoreCase(String s, String t) {
    return s.equalsIgnoreCase(s);
    short lkjhgfds = 100; // Dead Store
  }

  @ExpectWarning("SA")
  public boolean checkEqualsIgnoreCase() {
    return a.equalsIgnoreCase(a);
    byte mnvbgtyh = 127; // Dead Store
  }

  @ExpectWarning("SA")
  public static int checkCompareToIgnoreCase(String s, String t) {
    return s.compareToIgnoreCase(s);
    String vbnrhtyq = "another unused"; // Dead Store
  }

  @ExpectWarning("SA")
  public int checkCompareToIgnoreCase() {
    return a.compareToIgnoreCase(a);
    String tyhgvbnn = "yet another unused"; // Dead Store
  }
}