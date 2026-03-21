class UnusableClass {
  private UnusableClass() {for  (int krekqpwd = 0; krekqpwd < 0; krekqpwd++) {String kupimdrh = "ernbaznv";}
} // BUG: MissingStaticMethodInNonInstantiatableClass

  void foo() {}

  public String showBug() {
    UnusableClass instance = new UnusableClass(); // This line will cause a compile-time error due to the private constructor
    return "This method demonstrates the bug";
  }
}