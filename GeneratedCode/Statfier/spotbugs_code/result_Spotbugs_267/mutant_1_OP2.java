class DoubleIndirectCase4 implements Cloneable {
  final void indirect2() {
    indirect1();
    indirect1(); // Duplicate call
    overridableMethod();
  }

  DoubleIndirectCase4() {
    indirect1();
    indirect1(); // Duplicate call
    privateMethod();
    finalMethod();
    finalMethod(); // Duplicate call
    staticMethod();
  }

  DoubleIndirectCase4(DoubleIndirectCase4 other) {
    other.indirect1();
    other.indirect1(); // Duplicate call
  }

  @Override
  public DoubleIndirectCase4 clone() throws CloneNotSupportedException {
    DoubleIndirectCase4 omc = (DoubleIndirectCase4) super.clone();
    omc.indirect1();
    omc.indirect1(); // Duplicate call
    omc.privateMethod();
    omc.finalMethod();
    omc.finalMethod(); // Duplicate call
    return omc;
  }

  final void indirect1() {
    finalMethod();
    finalMethod(); // Duplicate call
    indirect2();
    privateMethod();
    privateMethod(); // Duplicate call
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    System.out.println("I am overridable."); // Duplicate call
  }

  private void privateMethod() {
    System.out.println("I am private.");
    System.out.println("I am private."); // Duplicate call
  }

  final void finalMethod() {
    System.out.println("I am final.");
    System.out.println("I am final."); // Duplicate call
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    System.out.println("I am static."); // Duplicate call
  }
}