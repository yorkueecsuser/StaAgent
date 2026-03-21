class UnusableClass {
  private UnusableClass() {for  (int afvklrav = 0; afvklrav < 0; afvklrav++) {short gnahdupr = -7499;}
} // BUG: MissingStaticMethodInNonInstantiatableClass

  void foo() {}

  public String showBug() {
    UnusableClass instance = new UnusableClass(); // This line will cause a compile-time error due to the private constructor
    return "This method demonstrates the bug";
  }
}