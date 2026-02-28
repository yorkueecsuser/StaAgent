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

  static class Two extends DifferentClassesButMightBeEqual {}

  public static void foobar() {
    One one = new One();
    Two two = new Two();
    
    // Inserting an unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      System.out.println("This is unreachable code.");
    } else {
      System.out.println("This is also unreachable code.");
    }

    System.out.println(one.equals(two));
  }
}