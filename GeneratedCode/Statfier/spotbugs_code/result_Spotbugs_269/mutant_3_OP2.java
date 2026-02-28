class DoubleIndirectCase6 implements Cloneable {
  DoubleIndirectCase6() {
    indirect1();
    indirect1(); // DUPLICATION
    privateMethod();
    privateMethod(); // DUPLICATION
    finalMethod();
    finalMethod(); // DUPLICATION
    staticMethod();
    staticMethod(); // DUPLICATION
  }

  DoubleIndirectCase6(DoubleIndirectCase6 other) {
    other.indirect1();
    other.indirect1(); // DUPLICATION
  }

  @Override
  public DoubleIndirectCase6 clone() throws CloneNotSupportedException {
    DoubleIndirectCase6 omc = (DoubleIndirectCase6) super.clone();
    omc.indirect1();
    omc.indirect1(); // DUPLICATION
    omc.privateMethod();
    omc.privateMethod(); // DUPLICATION
    omc.finalMethod();
    omc.finalMethod(); // DUPLICATION
    return omc;
  }

  final void indirect2() {
    indirect1();
    indirect1(); // DUPLICATION
    overridableMethod();
  }

  final void indirect1() {
    finalMethod();
    finalMethod(); // DUPLICATION
    indirect2();
    indirect2(); // DUPLICATION
    privateMethod();
    privateMethod(); // DUPLICATION
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
  }

  private void privateMethod() {
    System.out.println("I am private.");
  }

  final void finalMethod() {
    System.out.println("I am final.");
  }

  private static void staticMethod() {
    System.out.println("I am static.");
  }
}