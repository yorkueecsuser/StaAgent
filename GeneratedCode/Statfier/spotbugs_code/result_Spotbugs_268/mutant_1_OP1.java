class DoubleIndirectCase5 implements Cloneable {
  DoubleIndirectCase5() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    String abcdefgh = "deadstore"; // Dead Store Mutation
  }

  DoubleIndirectCase5(DoubleIndirectCase5 other) {
    other.indirect1();
    int hijklmno = 123; // Dead Store Mutation
  }

  @Override
  public DoubleIndirectCase5 clone() throws CloneNotSupportedException {
    DoubleIndirectCase5 omc = (DoubleIndirectCase5) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean pqrstuvw = false; // Dead Store Mutation
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    char xyzabcde = 'x'; // Dead Store Mutation
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
  }

  private void privateMethod() {
    System.out.println("I am private.");
    double fghijklm = 3.14; // Dead Store Mutation
  }

  final void finalMethod() {
    System.out.println("I am final.");
    long nopqrstu = 987654321L; // Dead Store Mutation
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    float vwxyzabc = 2.71f; // Dead Store Mutation
  }
}