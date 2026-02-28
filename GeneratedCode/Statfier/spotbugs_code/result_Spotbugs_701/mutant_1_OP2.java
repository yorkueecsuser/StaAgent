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

  static class One extends DifferentClassesButMightBeEqual {
    // No assignment statements without method invocation to duplicate
  };

  static class Two extends DifferentClassesButMightBeEqual {
    // No assignment statements without method invocation to duplicate
  };

  public static void foobar() {
    One one = new One();
    one.value = 5; // Original assignment
    one.value = 5; // Duplicated assignment
    Two two = new Two();
    two.value = 10; // Original assignment
    two.value = 10; // Duplicated assignment
    System.out.println(one.equals(two));
  }
}