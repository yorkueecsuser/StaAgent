class IndirectCase1 implements Cloneable {
  final void indirect() {
    overridableMethod();
  }

  IndirectCase1() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  IndirectCase1(IndirectCase1 other) {
    other.indirect();
  }

  @Override
  public IndirectCase1 clone() throws CloneNotSupportedException {
    IndirectCase1 omc = (IndirectCase1) super.clone();
    omc.indirect();
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

  // Mutated code starts here
  final void indirectx() {
    overridableMethod();
  }

  IndirectCase1(x) {
    indirectx();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  IndirectCase1(IndirectCase1 y) {
    y.indirectx();
  }

  @Override
  public IndirectCase1 clonex() throws CloneNotSupportedException {
    IndirectCase1 z = (IndirectCase1) super.clone();
    z.indirectx();
    z.privateMethod();
    z.finalMethod();
    return z;
  }

  void overridableMethodx() {
    System.out.println("I am overridable.");
  }

  private void privateMethodx() {
    System.out.println("I am private.");
  }

  final void finalMethodx() {
    System.out.println("I am final.");
  }

  private static void staticMethodx() {
    System.out.println("I am static.");
  }
}