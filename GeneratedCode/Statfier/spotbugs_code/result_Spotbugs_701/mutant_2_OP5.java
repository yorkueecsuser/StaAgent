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

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This will never be printed");
        break;
      default:
        // Default case to ensure the switch is not empty
        break;
    }
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch condition always evaluate to 1
    return false;
  }
}