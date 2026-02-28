class Ideas_2010_08_10 {

  int foo;

  public void setFoo(int foo) {
    foo = foo;

    // Introduced unreachable while loop as per mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the while loop is unreachable
    return false;
  }
}