class DirectCase implements Cloneable {
  DirectCase() {
    overridableMethod();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  DirectCase(DirectCase other) {
    other.overridableMethod();
  }

  @Override
  public DirectCase clone() throws CloneNotSupportedException {
    DirectCase omc = (DirectCase) super.clone();
    omc.overridableMethod();
    omc.privateMethod();
    omc.finalMethod();
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

  // Mutated code
  DirectCase(a a) {
    a.overridableMethod();
  }

  @Override
  public DirectCase b() throws CloneNotSupportedException {
    DirectCase c = (DirectCase) super.clone();
    c.overridableMethod();
    c.privateMethod();
    c.finalMethod();
    return c;
  }
}