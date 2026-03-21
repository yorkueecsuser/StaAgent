class UnusableClass {
  private UnusableClass() {} // BUG: MissingStaticMethodInNonInstantiatableClass

  void foo() {}
public String showBug() {
    UnusableClass instance = new UnusableClass();
    instance = new UnusableClass();
    return "This method demonstrates the bug";
}
}