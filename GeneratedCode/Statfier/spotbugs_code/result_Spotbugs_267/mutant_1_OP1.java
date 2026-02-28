class DoubleIndirectCase4 implements Cloneable {
  final void indirect2() {
    String abcdefgh = "unused"; // Dead Store Mutation
    indirect1();
    overridableMethod();
  }

  DoubleIndirectCase4() {
    int hijklmno = 0; // Dead Store Mutation
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  DoubleIndirectCase4(DoubleIndirectCase4 other) {
    char opqrstuv = 'x'; // Dead Store Mutation
    other.indirect1();
  }

  @Override
  public DoubleIndirectCase4 clone() throws CloneNotSupportedException {
    double vwxyzabc = 3.14; // Dead Store Mutation
    DoubleIndirectCase4 omc = (DoubleIndirectCase4) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  final void indirect1() {
    boolean defghijk = true; // Dead Store Mutation
    finalMethod();
    indirect2();
    privateMethod();
  }

  void overridableMethod() {
    float lmnopqrs = 2.71f; // Dead Store Mutation
    System.out.println("I am overridable.");
  }

  private void privateMethod() {
    long tuvwxyzA = 123456789L; // Dead Store Mutation
    System.out.println("I am private.");
  }

  final void finalMethod() {
    short BCDEFGHI = 123; // Dead Store Mutation
    System.out.println("I am final.");
  }

  private static void staticMethod() {
    byte JKLMNOPQ = 10; // Dead Store Mutation
    System.out.println("I am static.");
  }
}