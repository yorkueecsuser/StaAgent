class DirectCase implements Cloneable {
  DirectCase() {
    overridableMethod();
    privateMethod();
    finalMethod();
    staticMethod();
    // Dead Store Mutation
    String jkqzvwxy = "unused";
  }

  DirectCase(DirectCase other) {
    other.overridableMethod();
    // Dead Store Mutation
    int abcdefgh = 42;
  }

  @Override
  public DirectCase clone() throws CloneNotSupportedException {
    DirectCase omc = (DirectCase) super.clone();
    omc.overridableMethod();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Dead Store Mutation
    boolean hijklmno = true;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Dead Store Mutation
    char pqrstuvw = 'x';
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Dead Store Mutation
    double yzabcdef = 3.14;
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Dead Store Mutation
    float ghijklmn = 2.71f;
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Dead Store Mutation
    long opqrstuv = 100L;
  }
}