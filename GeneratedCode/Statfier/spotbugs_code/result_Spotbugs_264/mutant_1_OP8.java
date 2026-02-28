class DoubleIndirectCase1 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
  }

  DoubleIndirectCase1() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  DoubleIndirectCase1(DoubleIndirectCase1 other) {
    other.indirect1();
  }

  @Override
  public DoubleIndirectCase1 clone() throws CloneNotSupportedException {
    DoubleIndirectCase1 omc = (DoubleIndirectCase1) super.clone();
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
  final void indirecta() {
    finalMethod();
    indirect2();
    privateMethod();
  }

  final void indirectb() {
    indirecta();
    overridableMethod();
  }

  DoubleIndirectCase1(char c) {
    indirecta();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  DoubleIndirectCase1(DoubleIndirectCase1 oth) {
    oth.indirecta();
  }

  @Override
  public DoubleIndirectCase1 clone(char c) throws CloneNotSupportedException {
    DoubleIndirectCase1 omc = (DoubleIndirectCase1) super.clone();
    omc.indirecta();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  void overridablemeth() {
    System.out.println("I am overridable.");
  }

  private void privatemeth() {
    System.out.println("I am private.");
  }

  final void finalmeth() {
    System.out.println("I am final.");
  }

  private static void staticmeth() {
    System.out.println("I am static.");
  }
}