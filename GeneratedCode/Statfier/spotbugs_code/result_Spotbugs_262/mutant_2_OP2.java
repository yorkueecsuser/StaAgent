class DirectCase implements Cloneable {
  DirectCase() {
    overridableMethod();
    overridableMethod(); // DUPLICATION
    privateMethod();
    privateMethod(); // DUPLICATION
    finalMethod();
    finalMethod(); // DUPLICATION
    staticMethod();
    staticMethod(); // DUPLICATION
  }

  DirectCase(DirectCase other) {
    other.overridableMethod();
    other.overridableMethod(); // DUPLICATION
  }

  @Override
  public DirectCase clone() throws CloneNotSupportedException {
    DirectCase omc = (DirectCase) super.clone();
    omc.overridableMethod();
    omc.overridableMethod(); // DUPLICATION
    omc.privateMethod();
    omc.privateMethod(); // DUPLICATION
    omc.finalMethod();
    omc.finalMethod(); // DUPLICATION
    return omc;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
  }

  private void privateMethod() {
    System.out.println("I am private.");
  }

  final void finalMethod() {
    System.out.println("I am final.");
  }

  private static void staticMethod() {
    System.out.println("I am static.");
  }
}