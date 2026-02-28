class IndirectCase1 implements Cloneable {
  final void indirect() {
    overridableMethod();
    String abcd1234 = "unused"; // Dead Store mutation
  }

  IndirectCase1() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    int efgh5678 = 42; // Dead Store mutation
  }

  IndirectCase1(IndirectCase1 other) {
    other.indirect();
    boolean ijkl9012 = true; // Dead Store mutation
  }

  @Override
  public IndirectCase1 clone() throws CloneNotSupportedException {
    IndirectCase1 omc = (IndirectCase1) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    char mnop3456 = 'x'; // Dead Store mutation
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    double qrst6789 = 3.14; // Dead Store mutation
  }

  private void privateMethod() {
    System.out.println("I am private.");
    long tuvw1234 = 100L; // Dead Store mutation
  }

  final void finalMethod() {
    System.out.println("I am final.");
    float xyz0987 = 2.71f; // Dead Store mutation
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    short abcd5678 = 10; // Dead Store mutation
  }
}