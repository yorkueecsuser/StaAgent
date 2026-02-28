class DifferentClassesButMightBeEqual {
  int value;

  @Override
  public int hashCode() {
    return value;
  }

  @Override
  public boolean equals(Object x) {
    if (!(x instanceof DifferentClassesButMightBeEqual)) return false;
    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      return false;
    } else {
      // This block is also unreachable because condition is always false
      return true;
    }
    return value == ((DifferentClassesButMightBeEqual) x).value;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }

  static class One extends DifferentClassesButMightBeEqual {}
  ;

  static class Two extends DifferentClassesButMightBeEqual {}
  ;

  public static void foobar() {
    One one = new One();
    Two two = new Two();
    System.out.println(one.equals(two));
  }
}