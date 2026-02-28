class Bug2064273 {

  public boolean foo;

  public void setFoo(boolean foo) {
    this.foo = foo;
    this.foo = foo; // Mutated line: duplicated assignment
  }

  static class JunkSubClass extends Bug2064273 {
    @Override
    public void setFoo(boolean foo) {
      super.setFoo(false);
      super.setFoo(false); // Mutated line: duplicated assignment
    }
  }
}