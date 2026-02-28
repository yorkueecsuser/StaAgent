class NonShortCircuit {
  boolean b;

  boolean arrayDanger(int[] a, int i, int x) {
    return i < a.length & a[i] == x;
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  boolean bothBitsFalsePositive(int i) {
    return and((i & 0x1)!= 0, (i & 0x2)!= 0);
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  boolean bothBitsFalsePositive2(int i) {
    return combine((i & 0x1)!= 0, (i & 0x2)!= 0, (i & 0x4)!= 0)!= 0;
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  boolean and(boolean x, boolean y) {
    return x & y;
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  int combine(boolean x, boolean y, boolean z) {
    int result = 0;
    if (x) result += 1;
    if (y) result += 10;
    if (z) result += 100;
    return result;
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  void orIt(boolean x, boolean y) {
    x |= y;
    b |= x;
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  void andIt(boolean x, boolean y) {
    x &= y;
    b &= x;
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  void hardWay(Object x, Object y) {
    boolean r = x!= null;
    r &= y!= null;
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  boolean ordered(int x, int y, int z) {
    if (x >= y | y >= z) System.out.println("Not ordered");
    return x < y & y < z;
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  boolean nonEmpty(Object o[]) {
    return o!= null & o.length > 0;
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  public static final int BIT0 = 1; // 1st bit

  protected int m_iType;

  public NonShortCircuit(boolean available) {
    m_iType |= available? BIT0 : 0;
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  public String f(String tag, String value) {
    if (tag!= null & tag.length() > 0 && value!= null && value.length() > 0)
      return tag + ":" + value;
    return "?";
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      System.out.println("This is an unreachable if statement");
    }
  }
}