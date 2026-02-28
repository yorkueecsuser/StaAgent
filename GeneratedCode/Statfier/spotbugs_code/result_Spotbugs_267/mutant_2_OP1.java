class DoubleIndirectCase4 implements Cloneable {
  final void indirect2() {
    indirect1();
    overridableMethod();
    String abcdefgh = "deadstore"; // Dead store mutation
  }

  DoubleIndirectCase4() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    int hijklmno = 42; // Dead store mutation
  }

  DoubleIndirectCase4(DoubleIndirectCase4 other) {
    other.indirect1();
    boolean pqrstuvw = true; // Dead store mutation
  }

  @Override
  public DoubleIndirectCase4 clone() throws CloneNotSupportedException {
    DoubleIndirectCase4 omc = (DoubleIndirectCase4) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    char xyzabcde = 'x'; // Dead store mutation
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    double fghijklm = 3.14; // Dead store mutation
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    long nopqrstu = 100L; // Dead store mutation
  }

  private void privateMethod() {
    System.out.println("I am private.");
    float vwxyzabc = 2.71f; // Dead store mutation
  }

  final void finalMethod() {
    System.out.println("I am final.");
    short defghijk = 10; // Dead store mutation
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    byte lmnopqrs = 8; // Dead store mutation
  }
}