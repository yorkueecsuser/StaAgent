class DoubleIndirectCase3 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    String yzqjfnrj = "unused"; // Dead Store
  }

  DoubleIndirectCase3() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    int vbnrhtyq = 42; // Dead Store
  }

  DoubleIndirectCase3(DoubleIndirectCase3 other) {
    other.indirect1();
    char klmnopqr = 'x'; // Dead Store
  }

  @Override
  public DoubleIndirectCase3 clone() throws CloneNotSupportedException {
    DoubleIndirectCase3 omc = (DoubleIndirectCase3) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    boolean abcdefgh = true; // Dead Store
    return omc;
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    double rstuvwxy = 3.14; // Dead Store
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    long pqmnojkl = 123456789L; // Dead Store
  }

  private void privateMethod() {
    System.out.println("I am private.");
    float zxcvbnml = 2.718f; // Dead Store
  }

  final void finalMethod() {
    System.out.println("I am final.");
    short opqrstuv = 100; // Dead Store
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    byte tuvwxyzq = 10; // Dead Store
  }
}