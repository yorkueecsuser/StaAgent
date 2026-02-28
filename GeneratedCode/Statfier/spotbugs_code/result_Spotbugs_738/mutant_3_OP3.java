class Bug2064273 {

  public boolean foo;

  public void setFoo(boolean foo) {
    this.foo = foo;
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      this.foo = true; // This line is unreachable because condition is always false
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }

  static class JunkSubClass extends Bug2064273 {
    @Override
    public void setFoo(boolean foo) {
      super.setFoo(false);
      // Inserting an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        this.foo = true; // This line is unreachable because condition is always false
      }
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always returns false
    }
  }
}