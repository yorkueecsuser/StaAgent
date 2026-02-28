class Overloaded {
  public void foo(int x) {
    System.out.println(new Boolean(true));
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code");
    } else {
      System.out.println("This is unreachable code due to condition being false");
    }
  }

  public void foo(String s) {
    System.out.println(new Boolean(true));
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code");
    } else {
      System.out.println("This is unreachable code due to condition being false");
    }
  }

  public void foo(String s, boolean y) {
    System.out.println(new Boolean(true));
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code");
    } else {
      System.out.println("This is unreachable code due to condition being false");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}