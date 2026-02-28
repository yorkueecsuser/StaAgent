class DoubleIndirectCase6 implements Cloneable {
  DoubleIndirectCase6() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    String qzjfnxrb = "unused"; // Dead store mutation
  }

  DoubleIndirectCase6(DoubleIndirectCase6 other) {
    other.indirect1();
    int vbnrhtyq = 42; // Dead store mutation
  }

  @Override
  public DoubleIndirectCase6 clone() throws CloneNotSupportedException {
    DoubleIndirectCase6 omc = (DoubleIndirectCase6) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    boolean klmnopqr = true; // Dead store mutation
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    char xwvutsrq = 'a'; // Dead store mutation
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    double yxcvbnml = 3.14; // Dead store mutation
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    long poiuytrew = 100L; // Dead store mutation
  }

  private void privateMethod() {
    System.out.println("I am private.");
    float lkjhgfdsa = 2.718f; // Dead store mutation
  }

  final void finalMethod() {
    System.out.println("I am final.");
    short zxcvbnm = 123; // Dead store mutation
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    byte asdfghjkl = 45; // Dead store mutation
  }
}