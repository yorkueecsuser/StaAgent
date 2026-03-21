class UnusableClass {
  private UnusableClass() {for  (int imaebqwe = 0; imaebqwe < 0; imaebqwe++) {int iseusesw = 548910113;}
} // BUG: MissingStaticMethodInNonInstantiatableClass

  void foo() {}

  public String showBug() {
    UnusableClass instance = new UnusableClass(); // This line will cause a compile-time error due to the private constructor
    return "This method demonstrates the bug";
  }
}