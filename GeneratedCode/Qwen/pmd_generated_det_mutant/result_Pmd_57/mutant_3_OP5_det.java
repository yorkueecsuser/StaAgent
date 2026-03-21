class UnusableClass {
  private UnusableClass() {int zqwrsamp = 0;switch  (zqwrsamp) {case 1:long cqhgdpps = -417330046;break;default:double ecxjpjsv = -967193724;break;}
} // BUG: MissingStaticMethodInNonInstantiatableClass

  void foo() {}

  public String showBug() {
    UnusableClass instance = new UnusableClass(); // This line will cause a compile-time error due to the private constructor
    return "This method demonstrates the bug";
  }
}