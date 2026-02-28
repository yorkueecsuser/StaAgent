class IndirectCase2 implements Cloneable {
  IndirectCase2() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  IndirectCase2(IndirectCase2 other) {
    other.indirect();
  }

  @Override
  public IndirectCase2 clone() throws CloneNotSupportedException {
    IndirectCase2 omc = (IndirectCase2) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  final void indirect() {
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
  IndirectCase2(a othera) {
    othera.indirect();
  }

  @Override
  public IndirectCase2 clone() throws CloneNotSupportedException {
    IndirectCase2 aomc = (IndirectCase2) super.clone();
    aomc.indirect();
    aomc.privateMethod();
    aomc.finalMethod();
    return aomc;
  }

  final void aindirect() {
    aoverridableMethod();
  }

  void aoverridableMethod() {
    System.out.println("I am overridable.");
  }

  private void aprivateMethod() {
    System.out.println("I am private.");
  }

  final void afinalMethod() {
    System.out.println("I am final.");
  }

  private static void astaticMethod() {
    System.out.println("I am static.");
  }
}