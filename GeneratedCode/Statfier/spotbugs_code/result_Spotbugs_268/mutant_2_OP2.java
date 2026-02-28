class DoubleIndirectCase5 implements Cloneable {
  DoubleIndirectCase5() {
    indirect1();
    indirect1(); // Duplicate
    privateMethod();
    privateMethod(); // Duplicate
    finalMethod();
    finalMethod(); // Duplicate
    staticMethod();
    staticMethod(); // Duplicate
  }

  DoubleIndirectCase5(DoubleIndirectCase5 other) {
    other.indirect1();
    other.indirect1(); // Duplicate
  }

  @Override
  public DoubleIndirectCase5 clone() throws CloneNotSupportedException {
    DoubleIndirectCase5 omc = (DoubleIndirectCase5) super.clone();
    omc.indirect1();
    omc.indirect1(); // Duplicate
    omc.privateMethod();
    omc.privateMethod(); // Duplicate
    omc.finalMethod();
    omc.finalMethod(); // Duplicate
    return omc;
  }

  final void indirect1() {
    finalMethod();
    finalMethod(); // Duplicate
    indirect2();
    indirect2(); // Duplicate
    privateMethod();
    privateMethod(); // Duplicate
  }

  final void indirect2() {
    indirect1();
    indirect1(); // Duplicate
    overridableMethod();
    overridableMethod(); // Duplicate
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    System.out.println("I am overridable."); // Duplicate
  }

  private void privateMethod() {
    System.out.println("I am private.");
    System.out.println("I am private."); // Duplicate
  }

  final void finalMethod() {
    System.out.println("I am final.");
    System.out.println("I am final."); // Duplicate
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    System.out.println("I am static."); // Duplicate
  }
}