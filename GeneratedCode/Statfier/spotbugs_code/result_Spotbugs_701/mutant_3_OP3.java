class DifferentClassesButMightBeEqual {
  int value;

  @Override
  public int hashCode() {
    return value;
  }

  @Override
  public boolean equals(Object x) {
    if (!(x instanceof DifferentClassesButMightBeEqual)) return false;
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      value = 0;
    }
    return value == ((DifferentClassesButMightBeEqual) x).value;
  }

  private boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }

  static class One extends DifferentClassesButMightBeEqual {}

  static class Two extends DifferentClassesButMightBeEqual {}

  public static void foobar() {
    One one = new One();
    Two two = new Two();
    System.out.println(one.equals(two));
  }
}