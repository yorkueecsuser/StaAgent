class Ideas_2010_08_10 {

  int foo;

  public void setFoo(int foo) {
    foo = foo;

    // Introduced an unreachable if statement as per the mutation operator
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}