class NonShortCircuit {
  boolean b;

  boolean arrayDanger(int[] a, int i, int x) {
    return i < a.length & a[i] == x;
    // Unreachable for loop
    boolean conditionFor = false;
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable
    }
  }

  boolean bothBitsFalsePositive(int i) {
    return and((i & 0x1)!= 0, (i & 0x2)!= 0);
    // Unreachable for loop
    boolean conditionFor = false;
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable
    }
  }

  boolean bothBitsFalsePositive2(int i) {
    return combine((i & 0x1)!= 0, (i & 0x2)!= 0, (i & 0x4)!= 0)!= 0;
    // Unreachable for loop
    boolean conditionFor = false;
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable
    }
  }

  boolean and(boolean x, boolean y) {
    return x & y;
    // Unreachable for loop
    boolean conditionFor = false;
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable
    }
  }

  int combine(boolean x, boolean y, boolean z) {
    int result = 0;
    if (x) result += 1;
    if (y) result += 10;
    if (z) result += 100;
    return result;
    // Unreachable for loop
    boolean conditionFor = false;
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable
    }
  }

  void orIt(boolean x, boolean y) {
    x |= y;
    b |= x;
    // Unreachable for loop
    boolean conditionFor = false;
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable
    }
  }

  void andIt(boolean x, boolean y) {
    x &= y;
    b &= x;
    // Unreachable for loop
    boolean conditionFor = false;
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable
    }
  }

  void hardWay(Object x, Object y) {
    boolean r = x!= null;
    r &= y!= null;
    // Unreachable for loop
    boolean conditionFor = false;
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable
    }
  }

  boolean ordered(int x, int y, int z) {
    if (x >= y | y >= z) System.out.println("Not ordered");
    return x < y & y < z;
    // Unreachable for loop
    boolean conditionFor = false;
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable
    }
  }

  boolean nonEmpty(Object o[]) {
    return o!= null & o.length > 0;
    // Unreachable for loop
    boolean conditionFor = false;
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable
    }
  }

  public static final int BIT0 = 1; // 1st bit

  protected int m_iType;

  public NonShortCircuit(boolean available) {
    m_iType |= available? BIT0 : 0;
    // Unreachable for loop
    boolean conditionFor = false;
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable
    }
  }

  public String f(String tag, String value) {
    if (tag!= null & tag.length() > 0 && value!= null && value.length() > 0)
      return tag + ":" + value;
    return "?";
    // Unreachable for loop
    boolean conditionFor = false;
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable
    }
  }
}