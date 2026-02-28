class B extends A {
  private boolean condition = false;

  @Override
  public void foo() {
    if (condition) {
      // This block of code will be unreachable
      System.out.println("This code will never be executed");
    } else {
      super.foo();
    }
  }
}