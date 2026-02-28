class NullDeref7 {

  private void alwaysThrow() {
    throw new RuntimeException("Oops");
  }

  private void throwIfNull(Object o) {
    if (o == null) throw new RuntimeException("Got a null pointer");
  }

  public void foo(Object o) {
    if (o == null) alwaysThrow();
    System.out.println(o.hashCode());

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block in foo");
    } else {
      // This block will always execute
      System.out.println("This is the reachable block in foo");
    }
  }

  public void bar(Object o) {
    if (o == null) throwIfNull(o);
    System.out.println(o.hashCode());

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block in bar");
    } else {
      // This block will always execute
      System.out.println("This is the reachable block in bar");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}