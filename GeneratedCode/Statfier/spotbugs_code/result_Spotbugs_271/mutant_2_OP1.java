class IndirectCase2 implements Cloneable {
  IndirectCase2() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    // Dead Store Mutation
    String qwertyui = "unused";
  }

  IndirectCase2(IndirectCase2 other) {
    other.indirect();
    // Dead Store Mutation
    int asdfghjk = 42;
  }

  @Override
  public IndirectCase2 clone() throws CloneNotSupportedException {
    IndirectCase2 omc = (IndirectCase2) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Dead Store Mutation
    boolean zxcvbnmQ = true;
  }

  final void indirect() {
    overridableMethod();
    // Dead Store Mutation
    double poiuytrew = 3.14;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Dead Store Mutation
    char lkjhgfdsa = 'a';
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Dead Store Mutation
    float mnbvcxz = 2.71f;
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Dead Store Mutation
    long cvbnmPOI = 100L;
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Dead Store Mutation
    byte ertyuiop = 8;
  }
}