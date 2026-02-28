class Bug2064273 {

  public boolean foo;

  public void setFoo(boolean foo) {
    this.foo = foo;
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      this.foo = true;
    }
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime and always returns false
    return false;
  }

  static class JunkSubClass extends Bug2064273 {
    @Override
    public void setFoo(boolean foo) {
      super.setFoo(false);
      // Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() will never return true
        this.foo = true;
      }
    }

    private boolean getCondition() {
      // This method ensures the condition is dynamically determined at runtime and always returns false
      return false;
    }
  }
}