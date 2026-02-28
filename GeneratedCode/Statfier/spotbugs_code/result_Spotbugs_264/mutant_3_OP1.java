class DoubleIndirectCase1 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    // Dead Store Mutation
    String xqjvbnrt = "unused";
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    // Dead Store Mutation
    int rjvbnrtx = 42;
  }

  DoubleIndirectCase1() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    // Dead Store Mutation
    boolean vbnrtxqj = true;
  }

  DoubleIndirectCase1(DoubleIndirectCase1 other) {
    other.indirect1();
    // Dead Store Mutation
    char qjvbnrta = 'a';
  }

  @Override
  public DoubleIndirectCase1 clone() throws CloneNotSupportedException {
    DoubleIndirectCase1 omc = (DoubleIndirectCase1) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Dead Store Mutation
    double nrtxqjvb = 3.14;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Dead Store Mutation
    long jvbnrtxa = 100L;
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Dead Store Mutation
    float rtjaxqvbn = 2.71f;
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Dead Store Mutation
    short axqvbnrt = 10;
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Dead Store Mutation
    byte qvbnrtxq = 5;
  }
}