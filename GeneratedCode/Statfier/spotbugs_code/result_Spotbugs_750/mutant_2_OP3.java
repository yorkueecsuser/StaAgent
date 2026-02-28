class UselessControlFlow {

  void harmless1(Object x, Object y) {
    if (!x.equals(y)) {

    } else {

    }
    System.out.println(x);
    System.out.println(y);

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition will never be true
    }
  }

  void report0(Object x, Object y) {
    if (!x.equals(y))
      ;
    System.out.println(x);
    System.out.println(y);

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition will never be true
    }
  }

  void report1(Object x, Object y) {
    if (!x.equals(y))
      ;
    System.out.println(x);
    System.out.println(y);

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition will never be true
    }
  }

  void report2(Object x, Object y) {
    if (!x.equals(y))
      ;

    System.out.println(x);
    System.out.println(y);

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition will never be true
    }
  }

  void report3(Object x, Object y) {
    if (!x.equals(y))
      ;

    System.out.println(x);
    System.out.println(y);

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition will never be true
    }
  }

  void report4(Object[] x, Object y) {
    for (Object o : x) {
      if (o.equals(y)) {}
    }

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition will never be true
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be further modified to return false dynamically
  }
}