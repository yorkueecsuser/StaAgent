class DirectCase implements Cloneable {
  DirectCase() {
    overridableMethod();
    privateMethod();
    finalMethod();
    staticMethod();
    // Dead Store Mutation
    String qjxvbnrt = "unused";
  }

  DirectCase(DirectCase other) {
    other.overridableMethod();
    // Dead Store Mutation
    int wertypoi = 42;
  }

  @Override
  public DirectCase clone() throws CloneNotSupportedException {
    DirectCase omc = (DirectCase) super.clone();
    omc.overridableMethod();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Dead Store Mutation
    boolean lkjhgfds = false;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Dead Store Mutation
    double zxcvbnml = 3.14;
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Dead Store Mutation
    char asdfghjk = 'a';
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Dead Store Mutation
    long poiuytrewq = 123456789L;
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Dead Store Mutation
    float qwertyui = 2.718f;
  }
}