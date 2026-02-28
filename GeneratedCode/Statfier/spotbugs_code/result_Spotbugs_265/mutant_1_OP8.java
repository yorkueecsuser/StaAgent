class DoubleIndirectCase2 implements Cloneable {
  final void indirect2() {
    indirect1();
    overridableMethod();
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
  }

  DoubleIndirectCase2() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  DoubleIndirectCase2(DoubleIndirectCase2 other) {
    other.indirect1();
  }

  @Override
  public DoubleIndirectCase2 clone() throws CloneNotSupportedException {
    DoubleIndirectCase2 omc = (DoubleIndirectCase2) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
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
  final void indirectb() {
    indirecta();
    overridableMethod();
  }

  final void indirecta() {
    finalMethod();
    indirectb();
    privateMethod();
  }

  DoubleIndirectCase2(a) {
    indirecta();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  DoubleIndirectCase2(DoubleIndirectCase2 b) {
    b.indirecta();
  }

  @Override
  public DoubleIndirectCase2 clone() throws CloneNotSupportedException {
    DoubleIndirectCase2 c = (DoubleIndirectCase2) super.clone();
    c.indirecta();
    c.privateMethod();
    c.finalMethod();
    return c;
  }

  void overridableMethodb() {
    System.out.println("I am overridable.");
  }

  private void privateMethodb() {
    System.out.println("I am private.");
  }

  final void finalMethodb() {
    System.out.println("I am final.");
  }

  private static void staticMethodb() {
    System.out.println("I am static.");
  }
}