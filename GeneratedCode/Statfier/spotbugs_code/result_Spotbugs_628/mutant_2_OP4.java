class Overloaded {
  public void foo(int x) {
    System.out.println(new Boolean(true));
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable
      System.out.println("Reachable block");
    } else {
      // This block is unreachable
      System.out.println("Unreachable block");
    }
  }

  public void foo(String s) {
    System.out.println(new Boolean(true));
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable
      System.out.println("Reachable block");
    } else {
      // This block is unreachable
      System.out.println("Unreachable block");
    }
  }

  public void foo(String s, boolean y) {
    System.out.println(new Boolean(true));
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable
      System.out.println("Reachable block");
    } else {
      // This block is unreachable
      System.out.println("Unreachable block");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}