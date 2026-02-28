class DifferentClassesButMightBeEqual {
  int value;

  @Override
  public int hashCode() {
    return value;
  }

  @Override
  public boolean equals(Object x) {
    if (!(x instanceof DifferentClassesButMightBeEqual)) return false;
    return value == ((DifferentClassesButMightBeEqual) x).value;
  }

  static class One extends DifferentClassesButMightBeEqual {}
  ;

  static class Two extends DifferentClassesButMightBeEqual {}
  ;

  public static void foobar() {
    One one = new One();
    Two two = new Two();
    
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }

    System.out.println(one.equals(two));
  }

  private static boolean getCondition() {
    return false;
  }
}