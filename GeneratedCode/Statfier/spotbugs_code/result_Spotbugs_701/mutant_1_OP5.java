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
    System.out.println(one.equals(two));

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is unreachable");
        break;
      case 1:
        // This case will always be executed
        System.out.println("This is reachable");
        break;
    }
  }

  private static boolean getCondition() {
    // This method returns false, ensuring the switch statement is effectively unreachable
    return false;
  }
}