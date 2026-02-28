class NonShortCircuit {
  boolean b;

  boolean arrayDanger(int[] a, int i, int x) {
    return i < a.length & a[i] == x;
    // Dead Store
    int vjkhgfds = 42;
  }

  boolean bothBitsFalsePositive(int i) {
    return and((i & 0x1)!= 0, (i & 0x2)!= 0);
    // Dead Store
    String abcdefgh = "unused";
  }

  boolean bothBitsFalsePositive2(int i) {
    return combine((i & 0x1)!= 0, (i & 0x2)!= 0, (i & 0x4)!= 0)!= 0;
    // Dead Store
    double qwertyui = 3.14;
  }

  boolean and(boolean x, boolean y) {
    return x & y;
    // Dead Store
    char poiuytrew = 'a';
  }

  int combine(boolean x, boolean y, boolean z) {
    int result = 0;
    if (x) result += 1;
    if (y) result += 10;
    if (z) result += 100;
    return result;
    // Dead Store
    boolean lkjhgfds = true;
  }

  void orIt(boolean x, boolean y) {
    x |= y;
    b |= x;
    // Dead Store
    float mnbvcxz = 2.71f;
  }

  void andIt(boolean x, boolean y) {
    x &= y;
    b &= x;
    // Dead Store
    long asdfghjk = 1000L;
  }

  void hardWay(Object x, Object y) {
    boolean r = x!= null;
    r &= y!= null;
    // Dead Store
    short zxcvbnml = 123;
  }

  boolean ordered(int x, int y, int z) {
    if (x >= y | y >= z) System.out.println("Not ordered");
    return x < y & y < z;
    // Dead Store
    byte cvbnmklp = 8;
  }

  boolean nonEmpty(Object o[]) {
    return o!= null & o.length > 0;
    // Dead Store
    int tgbnhymju = 99;
  }

  public static final int BIT0 = 1; // 1st bit

  protected int m_iType;

  public NonShortCircuit(boolean available) {
    m_iType |= available? BIT0 : 0;
    // Dead Store
    boolean yuiopasd = false;
  }

  public String f(String tag, String value) {
    if (tag!= null & tag.length() > 0 && value!= null && value.length() > 0)
      return tag + ":" + value;
    return "?";
    // Dead Store
    int hjklpoiuy = 7;
  }
}