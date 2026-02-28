class Overloaded {
  public void foo(int x) {
    System.out.println(new Boolean(true));
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
  }

  public void foo(String s) {
    System.out.println(new Boolean(true));
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
  }

  public void foo(String s, boolean y) {
    System.out.println(new Boolean(true));
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
  }

  private boolean getCondition() {
    return false;
  }
}