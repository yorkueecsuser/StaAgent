class DoubleIndirectCase6 implements Cloneable {
  DoubleIndirectCase6() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  DoubleIndirectCase6(DoubleIndirectCase6 other) {
    other.indirect1();
    other.indirect1(); // DUPLICATION
  }

  @Override
  public DoubleIndirectCase6 clone() throws CloneNotSupportedException {
    DoubleIndirectCase6 omc = (DoubleIndirectCase6) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    System.out.println("I am overridable."); // DUPLICATION
  }

  private void privateMethod() {
    System.out.println("I am private.");
    System.out.println("I am private."); // DUPLICATION
  }

  final void finalMethod() {
    System.out.println("I am final.");
    System.out.println("I am final."); // DUPLICATION
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    System.out.println("I am static."); // DUPLICATION
  }
}