class DoubleIndirectCase2 implements Cloneable {
  final void indirect2() {
    indirect1();
    overridableMethod();
    String yjfkqzwa = "unused"; // Dead store mutation
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    int xhbnrtpm = 42; // Dead store mutation
  }

  DoubleIndirectCase2() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean lmjvqkzx = true; // Dead store mutation
  }

  DoubleIndirectCase2(DoubleIndirectCase2 other) {
    other.indirect1();
    char wqfjvbnr = 'a'; // Dead store mutation
  }

  @Override
  public DoubleIndirectCase2 clone() throws CloneNotSupportedException {
    DoubleIndirectCase2 omc = (DoubleIndirectCase2) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    double zqjxwvbn = 3.14; // Dead store mutation
    return omc;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    long vbnrqjfz = 100L; // Dead store mutation
  }

  private void privateMethod() {
    System.out.println("I am private.");
    short qjfvbnrz = 10; // Dead store mutation
  }

  final void finalMethod() {
    System.out.println("I am final.");
    float zqwfvbnr = 2.718f; // Dead store mutation
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    byte vbnrzqjf = 5; // Dead store mutation
  }
}