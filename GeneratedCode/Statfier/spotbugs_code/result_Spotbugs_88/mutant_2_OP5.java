class Ideas_2010_08_10 {

  int foo;

  public void setFoo(int foo) {
    foo = foo;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
      case 1:
        // This case is always executed
        System.out.println("This will always be printed");
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the first case of the switch unreachable
    return false;
  }
}