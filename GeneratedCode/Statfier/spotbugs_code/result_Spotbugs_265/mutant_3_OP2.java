class DoubleIndirectCase2 implements Cloneable {
  final void indirect2() {
    indirect1();
    indirect1(); // Duplicate of indirect1()
    overridableMethod();
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
  }

  DoubleIndirectCase2() {
    indirect1();
    indirect1(); // Duplicate of indirect1()
    privateMethod();
    finalMethod();
    staticMethod();
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
    omc.finalMethod();
    return omc;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    System.out.println("I am overridable."); // Duplicate of the print statement
  }

  private void privateMethod() {
    System.out.println("I am private.");
    System.out.println("I am private."); // Duplicate of the print statement
  }

  final void finalMethod() {
    System.out.println("I am final.");
    System.out.println("I am final."); // Duplicate of the print statement
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    System.out.println("I am static."); // Duplicate of the print statement
  }
}