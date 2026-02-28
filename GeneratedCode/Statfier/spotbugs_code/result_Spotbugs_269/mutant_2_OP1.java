class DoubleIndirectCase6 implements Cloneable {
  DoubleIndirectCase6() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    String abcdefgh = "unused"; // Dead Store
  }

  DoubleIndirectCase6(DoubleIndirectCase6 other) {
    other.indirect1();
    int hijklmno = 42; // Dead Store
  }

  @Override
  public DoubleIndirectCase6 clone() throws CloneNotSupportedException {
    DoubleIndirectCase6 omc = (DoubleIndirectCase6) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    boolean pqrstuvw = true; // Dead Store
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    char xyzabcde = 'x'; // Dead Store
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    double fghijklm = 3.14; // Dead Store
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    long nopqrstu = 100L; // Dead Store
  }

  private void privateMethod() {
    System.out.println("I am private.");
    float vwxyzabc = 2.71f; // Dead Store
  }

  final void finalMethod() {
    System.out.println("I am final.");
    short defghijk = 10; // Dead Store
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    byte lmnopqrs = 5; // Dead Store
  }
}