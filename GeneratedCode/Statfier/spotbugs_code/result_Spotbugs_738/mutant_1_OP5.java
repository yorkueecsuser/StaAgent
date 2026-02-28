class Bug2064273 {

  public boolean foo;

  public void setFoo(boolean foo) {
    this.foo = foo;
    // Introduced an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("This will also never be printed");
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }

  static class JunkSubClass extends Bug2064273 {
    @Override
    public void setFoo(boolean foo) {
      super.setFoo(false);
      // Introduced another unreachable switch statement
      boolean alwaysFalse = getAlwaysFalse();
      switch (alwaysFalse) {
        case true:
          System.out.println("This will never be printed in JunkSubClass");
          break;
        default:
          System.out.println("This will also never be printed in JunkSubClass");
          break;
      }
    }

    private boolean getAlwaysFalse() {
      return false;
    }
  }
}