class Bug2064273 {

  public boolean foo;

  public void setFoo(boolean foo) {
    this.foo = foo;
    // Introduced an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      this.foo = true; // This line is unreachable due to condition always being false
    }
  }

  static class JunkSubClass extends Bug2064273 {
    @Override
    public void setFoo(boolean foo) {
      super.setFoo(false);
      // Introduced an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        this.foo = true; // This line is unreachable due to condition always being false
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }
}