class DoubleIndirectCase2 implements Cloneable {
  final void indirect2() {
    indirect1();
    indirect1(); // Duplicate of indirect1()
    overridableMethod();
  }

  final void indirect1() {
    finalMethod();
    finalMethod(); // Duplicate of finalMethod()
    indirect2();
    privateMethod();
    privateMethod(); // Duplicate of privateMethod()
  }

  DoubleIndirectCase2() {
    indirect1();
    indirect1(); // Duplicate of indirect1()
    privateMethod();
    privateMethod(); // Duplicate of privateMethod()
    finalMethod();
    finalMethod(); // Duplicate of finalMethod()
    staticMethod();
    staticMethod(); // Duplicate of staticMethod()
  }

  DoubleIndirectCase2(DoubleIndirectCase2 other) {
    other.indirect1();
    other.indirect1(); // Duplicate of other.indirect1()
  }

  @Override
  public DoubleIndirectCase2 clone() throws CloneNotSupportedException {
    DoubleIndirectCase2 omc = (DoubleIndirectCase2) super.clone();
    omc.indirect1();
    omc.indirect1(); // Duplicate of omc.indirect1()
    omc.privateMethod();
    omc.privateMethod(); // Duplicate of omc.privateMethod()
    omc.finalMethod();
    omc.finalMethod(); // Duplicate of omc.finalMethod()
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
}