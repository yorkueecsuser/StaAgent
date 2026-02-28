class IndirectCase1 implements Cloneable {
  final void indirect() {
    overridableMethod();
    // Dead Store Mutation
    String abcdefgh = "unusedVariable";
  }

  IndirectCase1() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    // Dead Store Mutation
    int hijklmno = 42;
  }

  IndirectCase1(IndirectCase1 other) {
    other.indirect();
    // Dead Store Mutation
    boolean pqrstuvw = true;
  }

  @Override
  public IndirectCase1 clone() throws CloneNotSupportedException {
    IndirectCase1 omc = (IndirectCase1) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Dead Store Mutation
    double xyzabcde = 3.14;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Dead Store Mutation
    char fghijklm = 'x';
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Dead Store Mutation
    long nopqrstu = 1234567890L;
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Dead Store Mutation
    float vwxyzabc = 2.718f;
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Dead Store Mutation
    byte defghijk = 100;
  }
}