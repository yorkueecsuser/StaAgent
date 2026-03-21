class UnusableClass {
  private UnusableClass() {int ffpkical = 0;switch  (ffpkical) {case 1:float kgnusqfe = -604479446;break;default:String mncdhpjd = "lbbzrgdh";break;}
} // BUG: MissingStaticMethodInNonInstantiatableClass

  void foo() {}

  public String showBug() {
    UnusableClass instance = new UnusableClass(); // This line will cause a compile-time error due to the private constructor
    return "This method demonstrates the bug";
  }
}