class DifferentClassesButMightBeEqual {
  int value;

  @Override
  public int hashCode() {
    return value;
  }

  @Override
  public boolean equals(Object x) {
    if (!(x instanceof DifferentClassesButMightBeEqual)) return false;
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      value = 0;
    }
    return value == ((DifferentClassesButMightBeEqual) x).value;
  }

  private boolean getCondition() {
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