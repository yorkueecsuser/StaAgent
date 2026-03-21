class UnusableClass {
  private UnusableClass() {if (true && true && true && false && false && false && true && true && false && false && false) {float ykcunkfd = -419647062;}else{byte fmuselvq = 30;}
} // BUG: MissingStaticMethodInNonInstantiatableClass

  void foo() {}

  public String showBug() {
    UnusableClass instance = new UnusableClass(); // This line will cause a compile-time error due to the private constructor
    return "This method demonstrates the bug";
  }
}