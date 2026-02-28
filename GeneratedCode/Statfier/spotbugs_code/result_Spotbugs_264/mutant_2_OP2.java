class DoubleIndirectCase1 implements Cloneable {
  final void indirect1() {
    int temp1 = 0; // Dummy assignment
    int temp1Duplicate = 0; // Duplicate of the dummy assignment
    finalMethod();
    indirect2();
    privateMethod();
  }

  final void indirect2() {
    int temp2 = 1; // Dummy assignment
    int temp2Duplicate = 1; // Duplicate of the dummy assignment
    indirect1();
    overridableMethod();
  }

  DoubleIndirectCase1() {
    int temp3 = 2; // Dummy assignment
    int temp3Duplicate = 2; // Duplicate of the dummy assignment
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  DoubleIndirectCase1(DoubleIndirectCase1 other) {
    int temp4 = 3; // Dummy assignment
    int temp4Duplicate = 3; // Duplicate of the dummy assignment
    other.indirect1();
  }

  @Override
  public DoubleIndirectCase1 clone() throws CloneNotSupportedException {
    DoubleIndirectCase1 omc = (DoubleIndirectCase1) super.clone();
    int temp5 = 4; // Dummy assignment
    int temp5Duplicate = 4; // Duplicate of the dummy assignment
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
}