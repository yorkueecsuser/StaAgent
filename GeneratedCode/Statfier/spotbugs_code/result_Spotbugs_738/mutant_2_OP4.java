class Bug2064273 {

  public boolean foo;

  public void setFoo(boolean foo) {
    this.foo = foo;
    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will also never execute because the if condition is always false
      System.out.println("This is another unreachable block");
    }
  }

  private boolean getCondition() {
    return false;
  }

  static class JunkSubClass extends Bug2064273 {
    @Override
    public void setFoo(boolean foo) {
      super.setFoo(false);
      // Inserting unreachable if-else branch
      boolean condition = getCondition();
      if (condition) {
        // This block will never execute because getCondition() returns false
        System.out.println("This is an unreachable block in JunkSubClass");
      } else {
        // This block will also never execute because the if condition is always false
        System.out.println("This is another unreachable block in JunkSubClass");
      }
    }

    private boolean getCondition() {
      return false;
    }
  }
}