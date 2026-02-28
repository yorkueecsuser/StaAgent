class Bug2064273 {

  public boolean foo;

  public void setFoo(boolean foo) {
    this.foo = foo;
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() does not return true
        System.out.println("This is unreachable code");
        break;
      default:
        // Default case to satisfy switch requirement
        break;
    }
  }

  static class JunkSubClass extends Bug2064273 {
    @Override
    public void setFoo(boolean foo) {
      super.setFoo(false);
      // Introduced an unreachable switch statement
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case will never be reached because getCondition() does not return true
          System.out.println("This is unreachable code in subclass");
          break;
        default:
          // Default case to satisfy switch requirement
          break;
      }
    }
  }

  // Method to provide a dynamic condition that will never be true
  private boolean getCondition() {
    return false;
  }
}