class UnusableClass {
  private UnusableClass() {int lwmdgnvu = 0;switch  (lwmdgnvu) {case 1:char rkesloek = 'r';break;default:double odqchgsb = -799739454;break;}
} // BUG: MissingStaticMethodInNonInstantiatableClass

  void foo() {}

  public String showBug() {
    UnusableClass instance = new UnusableClass(); // This line will cause a compile-time error due to the private constructor
    return "This method demonstrates the bug";
  }
}