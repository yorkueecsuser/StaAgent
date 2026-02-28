class DoubleIndirectCase6 implements Cloneable {
  DoubleIndirectCase6() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    String abcdefgh = "deadstore"; // Dead Store Mutation
  }

  DoubleIndirectCase6(DoubleIndirectCase6 other) {
    other.indirect1();
    int hijklmno = 12345; // Dead Store Mutation
  }

  @Override
  public DoubleIndirectCase6 clone() throws CloneNotSupportedException {
    DoubleIndirectCase6 omc = (DoubleIndirectCase6) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    char pqrstuvw = 'x'; // Dead Store Mutation
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean xyzabcde = true; // Dead Store Mutation
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    double fghijklm = 3.14; // Dead Store Mutation
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    long nopqrstu = 987654321; // Dead Store Mutation
  }

  private void privateMethod() {
    System.out.println("I am private.");
    float vwxyzabc = 2.71f; // Dead Store Mutation
  }

  final void finalMethod() {
    System.out.println("I am final.");
    short defghijk = 100; // Dead Store Mutation
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    byte lmnopqrs = 50; // Dead Store Mutation
  }
}