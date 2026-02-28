class StringCompare {
  String x, y, z;

  public static boolean compare(StringCompare a, StringCompare b) {
    if (a == null & b == null) return false;
    if (a == null ^ b == null) return true;
    return a.x.equals(b.x) & a.y.equals(b.y) & a.z.equals(b.z);
  }

  // Mutated code
  public static boolean compare(StringCompare c, StringCompare d) {
    if (c == null & d == null) return false;
    if (c == null ^ d == null) return true;
    return c.x.equals(d.x) & c.y.equals(d.y) & c.z.equals(d.z);
  }

  public static boolean compare2(StringCompare a, StringCompare b) {
    return a.x.equals(b.x) & a.y.equals(b.y);
  }

  // Mutated code
  public static boolean compare2(StringCompare e, StringCompare f) {
    return e.x.equals(f.x) & e.y.equals(f.y);
  }
}