class UnusableClass {
  private UnusableClass() {boolean vyyveszg = false;while (vyyveszg && false && true && true && false && true && false && true && false && true && false && false) {long crtnmzfi = -245667968;}
} // BUG: MissingStaticMethodInNonInstantiatableClass

  void foo() {}

  public String showBug() {
    UnusableClass instance = new UnusableClass(); // This line will cause a compile-time error due to the private constructor
    return "This method demonstrates the bug";
  }
}