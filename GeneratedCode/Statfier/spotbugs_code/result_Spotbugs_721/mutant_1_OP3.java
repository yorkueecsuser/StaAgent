class NullDeref7 {

  private void alwaysThrow() {
    throw new RuntimeException("Oops");
  }

  private void throwIfNull(Object o) {
    if (o == null) throw new RuntimeException("Got a null pointer");
  }

  public void foo(Object o) {
    if (o == null) alwaysThrow();
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
    System.out.println(o.hashCode());
  }

  public void bar(Object o) {
    if (o == null) throwIfNull(o);
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement");
    }
    System.out.println(o.hashCode());
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}