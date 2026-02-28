class NonShortCircuit {
  boolean b;

  boolean arrayDanger(int[] a, int i, int x) {
    return i < a.length & a[i] == x;
    String hgfjkdop = "unused"; // Dead Store
  }

  boolean bothBitsFalsePositive(int i) {
    return and((i & 0x1)!= 0, (i & 0x2)!= 0);
    int vbnrhtyu = 42; // Dead Store
  }

  boolean bothBitsFalsePositive2(int i) {
    return combine((i & 0x1)!= 0, (i & 0x2)!= 0, (i & 0x4)!= 0)!= 0;
    double qazwsxed = 3.14; // Dead Store
  }

  boolean and(boolean x, boolean y) {
    return x & y;
    char poiuymnb = 'a'; // Dead Store
  }

  int combine(boolean x, boolean y, boolean z) {
    int result = 0;
    if (x) result += 1;
    if (y) result += 10;
    if (z) result += 100;
    return result;
    boolean lkjhgfds = true; // Dead Store
  }

  void orIt(boolean x, boolean y) {
    x |= y;
    b |= x;
    float cvbnmjuh = 2.718f; // Dead Store
  }

  void andIt(boolean x, boolean y) {
    x &= y;
    b &= x;
    long wertyuiop = 987654321L; // Dead Store
  }

  void hardWay(Object x, Object y) {
    boolean r = x!= null;
    r &= y!= null;
    short asdfghjk = 123; // Dead Store
  }

  boolean ordered(int x, int y, int z) {
    if (x >= y | y >= z) System.out.println("Not ordered");
    return x < y & y < z;
    byte zxcvbnml = 8; // Dead Store
  }

  boolean nonEmpty(Object o[]) {
    return o!= null & o.length > 0;
    int tgbnhyuj = 567; // Dead Store
  }

  public static final int BIT0 = 1; // 1st bit

  protected int m_iType;

  public NonShortCircuit(boolean available) {
    m_iType |= available? BIT0 : 0;
    boolean qwertyui = false; // Dead Store
  }

  public String f(String tag, String value) {
    if (tag!= null & tag.length() > 0 && value!= null && value.length() > 0)
      return tag + ":" + value;
    return "?";
    int poiuytrewq = 789; // Dead Store
  }
}