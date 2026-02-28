class DoubleIndirectCase4 implements Cloneable {
  final void indirect2() {
    indirect1();
    overridableMethod();
  }

  DoubleIndirectCase4() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  DoubleIndirectCase4(DoubleIndirectCase4 other) {
    other.indirect1();
  }

  @Override
  public DoubleIndirectCase4 clone() throws CloneNotSupportedException {
    DoubleIndirectCase4 omc = (DoubleIndirectCase4) super.clone();
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
  final void indirecta() {
    finalMethod();
    indirect2();
    privateMethod();
  }

  DoubleIndirectCase4(DoubleIndirectCase4 xtr) {
    xtr.indirect1();
  }

  @Override
  public DoubleIndirectCase4 clone() throws CloneNotSupportedException {
    DoubleIndirectCase4 ymc = (DoubleIndirectCase4) super.clone();
    ymc.indirect1();
    ymc.privateMethod();
    ymc.finalMethod();
    return ymc;
  }
}