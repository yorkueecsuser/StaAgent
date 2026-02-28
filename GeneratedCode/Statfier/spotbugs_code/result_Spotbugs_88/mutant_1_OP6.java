class Ideas_2010_08_10 {

  int foo;

  public void setFoo(int foo) {
    foo = foo;
    
    // Introduced an unreachable for loop according to the mutation operator
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute.");
    }
  }

  private boolean getCondition() {
    // This method returns false, making the loop condition always false
    return false;
  }
}