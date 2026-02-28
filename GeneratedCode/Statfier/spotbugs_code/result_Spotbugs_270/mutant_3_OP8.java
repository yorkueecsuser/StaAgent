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
  final void indirecta() {
    overridableMethod();
  }

  IndirectCase1(a) {
    indirecta();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  IndirectCase1(IndirectCase1 b) {
    b.indirecta();
  }

  @Override
  public IndirectCase1 clonea() throws CloneNotSupportedException {
    IndirectCase1 c = (IndirectCase1) super.clone();
    c.indirecta();
    c.privateMethod();
    c.finalMethod();
    return c;
  }

  void overridableMethoda() {
    System.out.println("I am overridable.");
  }

  private void privateMethoda() {
    System.out.println("I am private.");
  }

  final void finalMethoda() {
    System.out.println("I am final.");
  }

  private static void staticMethoda() {
    System.out.println("I am static.");
  }
}