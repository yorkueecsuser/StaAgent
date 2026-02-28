class IndirectCase2 implements Cloneable {
  IndirectCase2() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    // Dead Store Mutation
    String qvbnrhty = "unusedVariable";
  }

  IndirectCase2(IndirectCase2 other) {
    other.indirect();
    // Dead Store Mutation
    int wjxflmka = 42;
  }

  @Override
  public IndirectCase2 clone() throws CloneNotSupportedException {
    IndirectCase2 omc = (IndirectCase2) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Dead Store Mutation
    boolean jzqpnvbx = true;
  }

  final void indirect() {
    overridableMethod();
    // Dead Store Mutation
    double xqkfnmtp = 3.14;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Dead Store Mutation
    char yqjvbnrj = 'a';
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Dead Store Mutation
    long lmnbvqjf = 100L;
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Dead Store Mutation
    float vbnrqjxz = 2.71f;
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Dead Store Mutation
    short qjvbnrht = 10;
  }
}