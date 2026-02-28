class Overloaded {
  public void foo(int x) {
    System.out.println(new Boolean(true));
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable code");
    }
  }

  public void foo(String s) {
    System.out.println(new Boolean(true));
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable code");
    }
  }

  public void foo(String s, boolean y) {
    System.out.println(new Boolean(true));
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable code");
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}