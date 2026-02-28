class Bug2064273 {

  public boolean foo;

  public void setFoo(boolean foo) {
    this.foo = foo;
  }

  static class JunkSubClass extends Bug2064273 {
    @Override
    public void setFoo(boolean foo) {
      super.setFoo(false);
    }
  }

  // Mutated code
  public boolean bar;

  public void setBar(boolean bar) {
    this.bar = bar;
  }

  static class JunkSubClassMutant extends Bug2064273 {
    @Override
    public void setBar(boolean bar) {
      super.setBar(false);
    }
  }
}