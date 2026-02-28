class DoubleIndirectCase3 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    String yjvqznhg = "unused"; // Dead store mutation
  }

  DoubleIndirectCase3() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    int mfrtgbhn = 0; // Dead store mutation
  }

  DoubleIndirectCase3(DoubleIndirectCase3 other) {
    other.indirect1();
    boolean qazwsxed = false; // Dead store mutation
  }

  @Override
  public DoubleIndirectCase3 clone() throws CloneNotSupportedException {
    DoubleIndirectCase3 omc = (DoubleIndirectCase3) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    char cvbnrhty = 'x'; // Dead store mutation
    return omc;
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    double nmlkjihg = 3.14; // Dead store mutation
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    long plmoknji = 123456789L; // Dead store mutation
  }

  private void privateMethod() {
    System.out.println("I am private.");
    float asdfghjk = 1.23f; // Dead store mutation
  }

  final void finalMethod() {
    System.out.println("I am final.");
    short zxcvbnml = 10; // Dead store mutation
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    byte qwertyui = 5; // Dead store mutation
  }
}