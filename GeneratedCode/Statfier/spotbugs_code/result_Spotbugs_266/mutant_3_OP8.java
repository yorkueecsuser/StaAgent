class DoubleIndirectCase3 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
  }

  DoubleIndirectCase3() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  DoubleIndirectCase3(DoubleIndirectCase3 other) {
    other.indirect1();
  }

  @Override
  public DoubleIndirectCase3 clone() throws CloneNotSupportedException {
    DoubleIndirectCase3 omc = (DoubleIndirectCase3) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
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
  final void indirectx() {
    finalMethod();
    indirect2();
    privateMethod();
  }

  DoubleIndirectCase3(a othera) {
    othera.indirectx();
  }

  @Override
  public DoubleIndirectCase3 clonea() throws CloneNotSupportedException {
    DoubleIndirectCase3 omca = (DoubleIndirectCase3) super.clone();
    omca.indirectx();
    omca.privateMethod();
    omca.finalMethod();
    return omca;
  }

  final void indirect2a() {
    indirectx();
    overridableMethod();
  }
}