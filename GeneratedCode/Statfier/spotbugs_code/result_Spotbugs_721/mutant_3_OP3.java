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
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is unreachable code");
    }
    System.out.println(o.hashCode());
  }

  public void bar(Object o) {
    if (o == null) throwIfNull(o);
    // Inserting unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is unreachable code");
    }
    System.out.println(o.hashCode());
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if statement unreachable
  }
}