class Overloaded {
  public void foo(int x) {
    System.out.println(new Boolean(true));
    // Mutant: Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  public void foo(String s) {
    System.out.println(new Boolean(true));
    // Mutant: Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  public void foo(String s, boolean y) {
    System.out.println(new Boolean(true));
    // Mutant: Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}