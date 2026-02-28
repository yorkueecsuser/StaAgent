class Bug2064273 {

  public boolean foo;

  public void setFoo(boolean foo) {
    this.foo = foo;
    // Dead store mutation
    String abcdefgh = "abcdefgh";
  }

  static class JunkSubClass extends Bug2064273 {
    @Override
    public void setFoo(boolean foo) {
      super.setFoo(false);
      // Dead store mutation
      int ijklmnop = 12345678;
    }
  }
}