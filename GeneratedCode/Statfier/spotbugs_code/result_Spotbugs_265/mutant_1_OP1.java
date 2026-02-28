class DoubleIndirectCase2 implements Cloneable {
  final void indirect2() {
    indirect1();
    overridableMethod();
    String qwerasdf = "unused"; // Dead Store
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    int zxcvbnml = 42; // Dead Store
  }

  DoubleIndirectCase2() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean hjklpoiuyt = true; // Dead Store
  }

  DoubleIndirectCase2(DoubleIndirectCase2 other) {
    other.indirect1();
    char vbnmghjk = 'x'; // Dead Store
  }

  @Override
  public DoubleIndirectCase2 clone() throws CloneNotSupportedException {
    DoubleIndirectCase2 omc = (DoubleIndirectCase2) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    double tyuioplkjh = 3.14; // Dead Store
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    long asdfghjkl = 100L; // Dead Store
  }

  private void privateMethod() {
    System.out.println("I am private.");
    float qwertyuiop = 2.718f; // Dead Store
  }

  final void finalMethod() {
    System.out.println("I am final.");
    short poiuytrewq = 10; // Dead Store
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    byte lkjhgfdsa = 5; // Dead Store
  }
}