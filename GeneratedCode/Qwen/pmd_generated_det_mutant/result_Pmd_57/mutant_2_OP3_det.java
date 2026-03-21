class UnusableClass {
  private UnusableClass() {if (true && true && true && false && true && false && false && false && false && true && false) {boolean lirywgbk = true;}
} // BUG: MissingStaticMethodInNonInstantiatableClass

  void foo() {}

  public String showBug() {
    UnusableClass instance = new UnusableClass(); // This line will cause a compile-time error due to the private constructor
    return "This method demonstrates the bug";
  }
}