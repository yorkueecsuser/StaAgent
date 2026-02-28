class Overloaded {
  public void foo(int x) {
    System.out.println(new Boolean(true));
    // Mutant code
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  public void foo(String s) {
    System.out.println(new Boolean(true));
    // Mutant code
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  public void foo(String s, boolean y) {
    System.out.println(new Boolean(true));
    // Mutant code
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}