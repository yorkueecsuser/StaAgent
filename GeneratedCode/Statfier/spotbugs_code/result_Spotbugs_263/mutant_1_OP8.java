class DirectCaseObject implements Cloneable {
  DirectCaseObject() {
    overridableMethod();
    privateMethod();
    finalMethod();
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    DirectCaseObject omc = (DirectCaseObject) super.clone();
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

  // Mutated code
  DirectCaseObject(a) {
    overridableMethod();
    privateMethod();
    finalMethod();
  }

  @Override
  public Object b() throws CloneNotSupportedException {
    DirectCaseObject c = (DirectCaseObject) super.clone();
    c.overridableMethod();
    c.privateMethod();
    c.finalMethod();
    return c;
  }

  void d() {
    System.out.println("I am overridable.");
  }

  private void e() {
    System.out.println("I am private.");
  }

  final void f() {
    System.out.println("I am final.");
  }
}