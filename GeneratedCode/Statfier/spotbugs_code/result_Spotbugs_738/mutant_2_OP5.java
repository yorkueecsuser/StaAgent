class Bug2064273 {

  public boolean foo;

  public void setFoo(boolean foo) {
    this.foo = foo;
    
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getCondition() does not return true
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case is also unreachable for the same reason
        System.out.println("This is another unreachable case.");
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }

  static class JunkSubClass extends Bug2064273 {
    @Override
    public void setFoo(boolean foo) {
      super.setFoo(false);
      
      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is unreachable because getCondition() does not return true
          System.out.println("This is an unreachable case in JunkSubClass.");
          break;
        default:
          // Default case is also unreachable for the same reason
          System.out.println("This is another unreachable case in JunkSubClass.");
          break;
      }
    }

    private boolean getCondition() {
      // This method always returns false, making the switch statement unreachable
      return false;
    }
  }
}