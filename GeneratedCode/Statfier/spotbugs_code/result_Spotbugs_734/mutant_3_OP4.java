class NonShortCircuit {
  boolean b;

  boolean arrayDanger(int[] a, int i, int x) {
    return i < a.length & a[i] == x;
    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This is an unreachable if block");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  boolean bothBitsFalsePositive(int i) {
    return and((i & 0x1)!= 0, (i & 0x2)!= 0);
    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This is an unreachable if block");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  boolean bothBitsFalsePositive2(int i) {
    return combine((i & 0x1)!= 0, (i & 0x2)!= 0, (i & 0x4)!= 0)!= 0;
    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This is an unreachable if block");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  boolean and(boolean x, boolean y) {
    return x & y;
    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This is an unreachable if block");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  int combine(boolean x, boolean y, boolean z) {
    int result = 0;
    if (x) result += 1;
    if (y) result += 10;
    if (z) result += 100;
    return result;
    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This is an unreachable if block");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  void orIt(boolean x, boolean y) {
    x |= y;
    b |= x;
    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This is an unreachable if block");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  void andIt(boolean x, boolean y) {
    x &= y;
    b &= x;
    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This is an unreachable if block");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  void hardWay(Object x, Object y) {
    boolean r = x!= null;
    r &= y!= null;
    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This is an unreachable if block");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  boolean ordered(int x, int y, int z) {
    if (x >= y | y >= z) System.out.println("Not ordered");
    return x < y & y < z;
    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This is an unreachable if block");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  boolean nonEmpty(Object o[]) {
    return o!= null & o.length > 0;
    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This is an unreachable if block");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  public static final int BIT0 = 1; // 1st bit

  protected int m_iType;

  public NonShortCircuit(boolean available) {
    m_iType |= available? BIT0 : 0;
    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This is an unreachable if block");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  public String f(String tag, String value) {
    if (tag!= null & tag.length() > 0 && value!= null && value.length() > 0)
      return tag + ":" + value;
    return "?";
    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This is an unreachable if block");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }
}