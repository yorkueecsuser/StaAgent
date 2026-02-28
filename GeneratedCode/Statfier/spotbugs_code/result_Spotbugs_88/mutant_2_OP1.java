class Ideas_2010_08_10 {

  int foo;

  public void setFoo(int foo) {
    foo = foo;
    // Dead Store Mutation
    String xqjvbnrt = "unusedVariable";
  }
}