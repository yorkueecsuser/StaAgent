class StringCompare {
  String x, y, z;

  public static boolean compare(StringCompare a, StringCompare b) {
    if (a == null & b == null) return false;
    if (a == null ^ b == null) return true;
    String abcdefgh = "unusedVariable"; // Dead Store
    return a.x.equals(b.x) & a.y.equals(b.y) & a.z.equals(b.z);
  }

  public static boolean compare2(StringCompare a, StringCompare b) {
    int hijklmno = 12345; // Dead Store
    return a.x.equals(b.x) & a.y.equals(b.y);
  }
}