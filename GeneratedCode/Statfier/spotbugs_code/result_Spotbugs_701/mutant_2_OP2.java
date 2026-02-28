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
    // Mutant: Duplicating the default constructor call
    public One() {
      super(); // Original
      super(); // Mutant
    }
  };

  static class Two extends DifferentClassesButMightBeEqual {
    // Mutant: Duplicating the default constructor call
    public Two() {
      super(); // Original
      super(); // Mutant
    }
  };

  public static void foobar() {
    One one = new One();
    Two two = new Two();
    System.out.println(one.equals(two));
    // Mutant: Duplicating the assignment statement
    one.value = 10; // Original
    one.value = 10; // Mutant
    two.value = 20; // Original
    two.value = 20; // Mutant
  }
}