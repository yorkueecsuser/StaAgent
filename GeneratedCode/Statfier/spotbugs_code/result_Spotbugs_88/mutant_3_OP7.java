class Ideas_2010_08_10 {

  int foo;

  public void setFoo(int foo) {
    foo = foo;
    
    // Introduced unreachable while loop according to mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  private boolean getCondition() {
    return false;
  }
}