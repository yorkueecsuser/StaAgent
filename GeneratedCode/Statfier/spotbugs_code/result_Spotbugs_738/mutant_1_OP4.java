class Bug2064273 {

  public boolean foo;

  public void setFoo(boolean foo) {
    this.foo = foo;
    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      this.foo = true;
    } else {
      // This block will also never be executed because condition is always false
      this.foo = false;
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if-else block unreachable
  }

  static class JunkSubClass extends Bug2064273 {
    @Override
    public void setFoo(boolean foo) {
      super.setFoo(false);
      // Inserting an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block will never be executed because condition is always false
        this.foo = true;
      } else {
        // This block will also never be executed because condition is always false
        this.foo = false;
      }
    }

    private boolean getCondition() {
      return false; // This method always returns false, making the if-else block unreachable
    }
  }
}