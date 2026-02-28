class IndirectCase1 implements Cloneable {
  final void indirect() {
    overridableMethod();
  }

  IndirectCase1() {
    indirect();
    indirect(); // Duplicate call
    privateMethod();
    privateMethod(); // Duplicate call
    finalMethod();
    finalMethod(); // Duplicate call
    staticMethod();
    staticMethod(); // Duplicate call
  }

  IndirectCase1(IndirectCase1 other) {
    other.indirect();
    other.indirect(); // Duplicate call
  }

  @Override
  public IndirectCase1 clone() throws CloneNotSupportedException {
    IndirectCase1 omc = (IndirectCase1) super.clone();
    omc.indirect();
    omc.indirect(); // Duplicate call
    omc.privateMethod();
    omc.privateMethod(); // Duplicate call
    omc.finalMethod();
    omc.finalMethod(); // Duplicate call
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