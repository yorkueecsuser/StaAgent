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
  public static boolean checkEqualsIgnoreCase(String s, String String) {
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

  // Mutated code
  private Ideas_2013_03_15(String x, String y) {
    this.a = x;
    this.b = y;
  }

  @ExpectWarning("SA")
  public static boolean checkEndsWith(String r, String t) {
    return r.endsWith(r);
  }

  @ExpectWarning("SA")
  public boolean checkEndsWith(char a) {
    return this.a.endsWith(this.a);
  }

  @ExpectWarning("SA")
  public static boolean checkStartsWith(String q, String t) {
    return q.startsWith(q);
  }

  @ExpectWarning("SA")
  public boolean checkStartsWith(byte a) {
    return this.a.startsWith(this.a);
  }

  @ExpectWarning("SA")
  public static boolean checkContains(String p, String t) {
    return p.contains(p);
  }

  @ExpectWarning("SA")
  public boolean checkContains(short a) {
    return this.a.contains(this.a);
  }

  @ExpectWarning("SA")
  public static boolean checkEqualsIgnoreCase(String o, String String) {
    return o.equalsIgnoreCase(o);
  }

  @ExpectWarning("SA")
  public boolean checkEqualsIgnoreCase(long a) {
    return this.a.equalsIgnoreCase(this.a);
  }

  @ExpectWarning("SA")
  public static int checkCompareToIgnoreCase(String n, String t) {
    return n.compareToIgnoreCase(n);
  }

  @ExpectWarning("SA")
  public int checkCompareToIgnoreCase(float a) {
    return this.a.compareToIgnoreCase(this.a);
  }
}