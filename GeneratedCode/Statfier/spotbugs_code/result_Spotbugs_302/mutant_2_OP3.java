class Ideas_2011_07_26 {

  Boolean foo(int x) {
    if (x > 0) return true;
    if (x < 0) return false;
    return null;
  }

  void f(int x) {
    if (foo(x)) System.out.println("Foo");
    
    // Mutant code: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, making the if block unreachable
  }
}