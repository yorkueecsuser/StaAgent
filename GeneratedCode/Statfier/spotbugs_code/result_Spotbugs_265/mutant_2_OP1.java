class DoubleIndirectCase2 implements Cloneable {
  final void indirect2() {
    indirect1();
    overridableMethod();
    String abcdefgh = "unused"; // Dead store mutation
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    int hijklmno = 42; // Dead store mutation
  }

  DoubleIndirectCase2() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean pqrsutvw = true; // Dead store mutation
  }

  DoubleIndirectCase2(DoubleIndirectCase2 other) {
    other.indirect1();
    char xyzabcde = 'x'; // Dead store mutation
  }

  @Override
  public DoubleIndirectCase2 clone() throws CloneNotSupportedException {
    DoubleIndirectCase2 omc = (DoubleIndirectCase2) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    long fghijklm = 123456789L; // Dead store mutation
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    float nopqrstu = 3.14f; // Dead store mutation
  }

  private void privateMethod() {
    System.out.println("I am private.");
    double vwxyzabc = 2.718; // Dead store mutation
  }

  final void finalMethod() {
    System.out.println("I am final.");
    short defghijk = 100; // Dead store mutation
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    byte lmnopqrs = 8; // Dead store mutation
  }
}