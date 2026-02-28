class DoubleIndirectCase3 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    String qwejklmn = "unused"; // Dead Store
  }

  DoubleIndirectCase3() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    int abcdefgh = 42; // Dead Store
  }

  DoubleIndirectCase3(DoubleIndirectCase3 other) {
    other.indirect1();
    boolean hijklmno = true; // Dead Store
  }

  @Override
  public DoubleIndirectCase3 clone() throws CloneNotSupportedException {
    DoubleIndirectCase3 omc = (DoubleIndirectCase3) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    char pqrsabcd = 'x'; // Dead Store
    return omc;
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    double efghijkl = 3.14; // Dead Store
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    long mnopqrst = 100L; // Dead Store
  }

  private void privateMethod() {
    System.out.println("I am private.");
    float tuvwxyzp = 2.71f; // Dead Store
  }

  final void finalMethod() {
    System.out.println("I am final.");
    short qrstuvwx = 10; // Dead Store
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    byte yzabcdpq = 5; // Dead Store
  }
}