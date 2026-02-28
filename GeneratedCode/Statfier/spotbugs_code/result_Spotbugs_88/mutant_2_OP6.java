class Ideas_2010_08_10 {

  int foo;

  public void setFoo(int foo) {
    foo = foo;
    
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false at runtime
    }
  }

  private boolean getCondition() {
    return false;
  }
}