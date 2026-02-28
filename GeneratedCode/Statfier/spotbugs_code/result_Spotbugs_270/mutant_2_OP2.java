class IndirectCase1 implements Cloneable {
  final void indirect() {
    overridableMethod();
    overridableMethod(); // DUPLICATION: Duplicate of overridableMethod();
  }

  IndirectCase1() {
    indirect();
    indirect(); // DUPLICATION: Duplicate of indirect();
    privateMethod();
    privateMethod(); // DUPLICATION: Duplicate of privateMethod();
    finalMethod();
    finalMethod(); // DUPLICATION: Duplicate of finalMethod();
    staticMethod();
    staticMethod(); // DUPLICATION: Duplicate of staticMethod();
  }

  IndirectCase1(IndirectCase1 other) {
    other.indirect();
    other.indirect(); // DUPLICATION: Duplicate of other.indirect();
  }

  @Override
  public IndirectCase1 clone() throws CloneNotSupportedException {
    IndirectCase1 omc = (IndirectCase1) super.clone();
    omc.indirect();
    omc.indirect(); // DUPLICATION: Duplicate of omc.indirect();
    omc.privateMethod();
    omc.privateMethod(); // DUPLICATION: Duplicate of omc.privateMethod();
    omc.finalMethod();
    omc.finalMethod(); // DUPLICATION: Duplicate of omc.finalMethod();
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