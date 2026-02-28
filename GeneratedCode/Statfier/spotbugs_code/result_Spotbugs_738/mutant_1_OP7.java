class Bug2064273 {

  public boolean foo;

  public void setFoo(boolean foo) {
    this.foo = foo;
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code block
      System.out.println("This is an unreachable loop");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the loop unreachable
  }

  static class JunkSubClass extends Bug2064273 {
    @Override
    public void setFoo(boolean foo) {
      super.setFoo(false);
      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code block
        System.out.println("This is an unreachable loop in subclass");
      }
    }

    private boolean getCondition() {
      return false; // This method always returns false, making the loop unreachable
    }
  }
}