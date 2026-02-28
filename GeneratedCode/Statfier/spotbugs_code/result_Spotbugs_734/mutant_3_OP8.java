class NonShortCircuit {
  boolean b;

  boolean arrayDanger(int[] a, int i, int x) {
    return i < a.length & a[i] == x;
  }

  boolean bothBitsFalsePositive(int i) {
    return and((i & 0x1)!= 0, (i & 0x2)!= 0);
  }

  boolean bothBitsFalsePositive2(int i) {
    return combine((i & 0x1)!= 0, (i & 0x2)!= 0, (i & 0x4)!= 0)!= 0;
  }

  boolean and(boolean x, boolean y) {
    return x & y;
  }

  int combine(boolean x, boolean y, boolean z) {
    int result = 0;
    if (x) result += 1;
    if (y) result += 10;
    if (z) result += 100;
    return result;
  }

  void orIt(boolean x, boolean y) {
    x |= y;
    b |= x;
  }

  void andIt(boolean x, boolean y) {
    x &= y;
    b &= x;
  }

  void hardWay(Object x, Object y) {
    boolean r = x!= null;
    r &= y!= null;
  }

  boolean ordered(int x, int y, int z) {
    if (x >= y | y >= z) System.out.println("Not ordered");
    return x < y & y < z;
  }

  boolean nonEmpty(Object o[]) {
    return o!= null & o.length > 0;
  }

  public static final int BIT0 = 1; // 1st bit

  protected int m_iType;

  public NonShortCircuit(boolean available) {
    m_iType |= available? BIT0 : 0;
  }

  public String f(String tag, String value) {
    if (tag!= null & tag.length() > 0 && value!= null && value.length() > 0)
      return tag + ":" + value;
    return "?";
  }

  // Mutated code
  boolean arrayDanger(int[] a, int j, int x) {
    return j < a.length & a[j] == x;
  }

  boolean bothBitsFalsePositive(int k) {
    return and((k & 0x1)!= 0, (k & 0x2)!= 0);
  }

  boolean bothBitsFalsePositive2(int l) {
    return combine((l & 0x1)!= 0, (l & 0x2)!= 0, (l & 0x4)!= 0)!= 0;
  }

  boolean and(boolean p, boolean q) {
    return p & q;
  }

  int combine(boolean p, boolean q, boolean r) {
    int result = 0;
    if (p) result += 1;
    if (q) result += 10;
    if (r) result += 100;
    return result;
  }

  void orIt(boolean p, boolean q) {
    p |= q;
    b |= p;
  }

  void andIt(boolean p, boolean q) {
    p &= q;
    b &= p;
  }

  void hardWay(Object u, Object v) {
    boolean w = u!= null;
    w &= v!= null;
  }

  boolean ordered(int m, int n, int o) {
    if (m >= n | n >= o) System.out.println("Not ordered");
    return m < n & n < o;
  }

  boolean nonEmpty(Object n[]) {
    return n!= null & n.length > 0;
  }

  public NonShortCircuit(boolean c) {
    m_iType |= c? BIT0 : 0;
  }

  public String f(String s, String t) {
    if (s!= null & s.length() > 0 && t!= null && t.length() > 0)
      return s + ":" + t;
    return "?";
  }
}