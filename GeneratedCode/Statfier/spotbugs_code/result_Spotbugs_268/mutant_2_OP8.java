class DoubleIndirectCase5 implements Cloneable {
  DoubleIndirectCase5() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  DoubleIndirectCase5(DoubleIndirectCase5 other) {
    other.indirect1();
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
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
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

  // Mutated code
  final void z() {
    finalMethod();
    indirect2();
    privateMethod();
  }

  final void x() {
    z();
    overridableMethod();
  }

  void y() {
    System.out.println("I am overridable.");
  }

  private void q() {
    System.out.println("I am private.");
  }

  final void p() {
    System.out.println("I am final.");
  }

  private static void w() {
    System.out.println("I am static.");
  }
}