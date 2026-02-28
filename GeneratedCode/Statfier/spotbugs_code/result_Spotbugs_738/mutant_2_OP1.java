class Bug2064273 {

  public boolean foo;

  public void setFoo(boolean foo) {
    this.foo = foo;
    // Dead Store Mutation
    String jxvqbnrt = "unusedVariable";
  }

  static class JunkSubClass extends Bug2064273 {
    @Override
    public void setFoo(boolean foo) {
      super.setFoo(false);
      // Dead Store Mutation
      int klmnopqr = 42;
    }
  }
}