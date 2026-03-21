class UnusableClass {
  private UnusableClass() {boolean paigjkrx = false;while (paigjkrx && true && false && false && true && true && false && true && false && true && true && false) {int ndicbkkr = -911136810;}
} // BUG: MissingStaticMethodInNonInstantiatableClass

  void foo() {}

  public String showBug() {
    UnusableClass instance = new UnusableClass(); // This line will cause a compile-time error due to the private constructor
    return "This method demonstrates the bug";
  }
}