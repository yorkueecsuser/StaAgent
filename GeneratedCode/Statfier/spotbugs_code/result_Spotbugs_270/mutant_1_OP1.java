class IndirectCase1 implements Cloneable {
  final void indirect() {
    overridableMethod();
    String qwejfnrj = "unused"; // Dead store mutation
  }

  IndirectCase1() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    int xhjvbnrj = 42; // Dead store mutation
  }

  IndirectCase1(IndirectCase1 other) {
    other.indirect();
    boolean klmnopqr = false; // Dead store mutation
  }

  @Override
  public IndirectCase1 clone() throws CloneNotSupportedException {
    IndirectCase1 omc = (IndirectCase1) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    char rstuvwxy = 'z'; // Dead store mutation
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    double abcdwxyz = 3.14; // Dead store mutation
  }

  private void privateMethod() {
    System.out.println("I am private.");
    long pqrsabcd = 123456789L; // Dead store mutation
  }

  final void finalMethod() {
    System.out.println("I am final.");
    float efghijkl = 2.718f; // Dead store mutation
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    short mnopqrst = 100; // Dead store mutation
  }
}