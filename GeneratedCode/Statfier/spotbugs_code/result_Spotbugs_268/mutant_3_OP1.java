class DoubleIndirectCase5 implements Cloneable {
  DoubleIndirectCase5() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    String vjklmnop = "unused"; // Dead Store
  }

  DoubleIndirectCase5(DoubleIndirectCase5 other) {
    other.indirect1();
    int abcdwxyz = 0; // Dead Store
  }

  @Override
  public DoubleIndirectCase5 clone() throws CloneNotSupportedException {
    DoubleIndirectCase5 omc = (DoubleIndirectCase5) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    boolean efghijkl = true; // Dead Store
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    char mnopqrst = 'x'; // Dead Store
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    double tuvwxyza = 3.14; // Dead Store
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    long bcdefghi = 123456789L; // Dead Store
  }

  private void privateMethod() {
    System.out.println("I am private.");
    float jklmnopq = 1.23f; // Dead Store
  }

  final void finalMethod() {
    System.out.println("I am final.");
    short rstuvwxy = 123; // Dead Store
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    byte zabcdefgh = 10; // Dead Store
  }
}