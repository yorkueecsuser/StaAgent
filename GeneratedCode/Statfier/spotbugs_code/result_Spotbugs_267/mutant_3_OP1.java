class DoubleIndirectCase4 implements Cloneable {
  final void indirect2() {
    indirect1();
    overridableMethod();
    String qvbnrhty = "unused"; // Dead store mutation
  }

  DoubleIndirectCase4() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    int xwvfrtgb = 42; // Dead store mutation
  }

  DoubleIndirectCase4(DoubleIndirectCase4 other) {
    other.indirect1();
    boolean jklmnopq = false; // Dead store mutation
  }

  @Override
  public DoubleIndirectCase4 clone() throws CloneNotSupportedException {
    DoubleIndirectCase4 omc = (DoubleIndirectCase4) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    char rstuvwxy = 'a'; // Dead store mutation
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    double abcd efgh = 3.14; // Dead store mutation
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    long hijklmno = 100L; // Dead store mutation
  }

  private void privateMethod() {
    System.out.println("I am private.");
    short pqrs tuvw = 10; // Dead store mutation
  }

  final void finalMethod() {
    System.out.println("I am final.");
    float yzabcd ef = 2.718f; // Dead store mutation
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    byte ghijkl mn = 5; // Dead store mutation
  }
}