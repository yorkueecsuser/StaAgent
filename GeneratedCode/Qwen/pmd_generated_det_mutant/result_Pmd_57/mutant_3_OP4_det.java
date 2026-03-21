class UnusableClass {
  private UnusableClass() {if (false && false && false && true && false && true && true && false && false && true && false) {byte hnpnkwmw = -86;}else{byte uxxcxvvy = -24;}
} // BUG: MissingStaticMethodInNonInstantiatableClass

  void foo() {}

  public String showBug() {
    UnusableClass instance = new UnusableClass(); // This line will cause a compile-time error due to the private constructor
    return "This method demonstrates the bug";
  }
}