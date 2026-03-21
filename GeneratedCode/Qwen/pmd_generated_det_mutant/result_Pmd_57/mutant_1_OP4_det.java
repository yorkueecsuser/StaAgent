class UnusableClass {
  private UnusableClass() {if (true && false && false && true && true && false && false && true && false && true && false) {long xbsqdhme = -623554539;}else{long mggrvenx = 683697280;}
} // BUG: MissingStaticMethodInNonInstantiatableClass

  void foo() {}

  public String showBug() {
    UnusableClass instance = new UnusableClass(); // This line will cause a compile-time error due to the private constructor
    return "This method demonstrates the bug";
  }
}