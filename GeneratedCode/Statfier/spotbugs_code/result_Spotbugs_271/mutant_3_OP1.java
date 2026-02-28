class IndirectCase2 implements Cloneable {
  IndirectCase2() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    // Dead Store Mutation
    String qzjxvbnm = "unused";
  }

  IndirectCase2(IndirectCase2 other) {
    other.indirect();
    // Dead Store Mutation
    int rmnhtyui = 42;
  }

  @Override
  public IndirectCase2 clone() throws CloneNotSupportedException {
    IndirectCase2 omc = (IndirectCase2) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Dead Store Mutation
    boolean wplkjhgf = true;
  }

  final void indirect() {
    overridableMethod();
    // Dead Store Mutation
    char vbnmqzjx = 'a';
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Dead Store Mutation
    double yuioplkj = 3.14;
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Dead Store Mutation
    long hjklmnbv = 123456789L;
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Dead Store Mutation
    float asdfghjk = 2.718f;
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Dead Store Mutation
    short zxcvbnml = 100;
  }
}