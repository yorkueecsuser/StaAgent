class UselessControlFlow {

  void harmless1(Object x, Object y) {
    if (!x.equals(y)) {

    } else {

    }
    // Mutant: Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
    } else {
      // This block is unreachable if shouldRun is true
    }
    System.out.println(x);
    System.out.println(y);
  }

  void report0(Object x, Object y) {
    if (!x.equals(y))
      ;
    System.out.println(x);
    System.out.println(y);
    // Mutant: Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
    } else {
      // This block is unreachable if shouldRun is true
    }
  }

  void report1(Object x, Object y) {
    if (!x.equals(y))
      ;
    System.out.println(x);
    System.out.println(y);
    // Mutant: Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
    } else {
      // This block is unreachable if shouldRun is true
    }
  }

  void report2(Object x, Object y) {
    if (!x.equals(y))
      ;

    System.out.println(x);
    System.out.println(y);
    // Mutant: Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
    } else {
      // This block is unreachable if shouldRun is true
    }
  }

  void report3(Object x, Object y) {
    if (!x.equals(y))
      ;

    System.out.println(x);
    System.out.println(y);
    // Mutant: Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
    } else {
      // This block is unreachable if shouldRun is true
    }
  }

  void report4(Object[] x, Object y) {
    for (Object o : x) {
      if (o.equals(y)) {}
    }
    // Mutant: Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
    } else {
      // This block is unreachable if shouldRun is true
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will make the else block unreachable, but the condition is dynamically determined
  }
}