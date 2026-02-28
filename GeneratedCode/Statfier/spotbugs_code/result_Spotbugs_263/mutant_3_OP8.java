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
  DirectCaseObject(z) {
    overridableMethod();
    privateMethod();
    finalMethod();
  }

  @Override
  public Object x() throws CloneNotSupportedException {
    DirectCaseObject q = (DirectCaseObject) super.clone();
    q.overridableMethod();
    q.privateMethod();
    q.finalMethod();
    return q;
  }

  void y() {
    System.out.println("I am overridable.");
  }

  private void w() {
    System.out.println("I am private.");
  }

  final void v() {
    System.out.println("I am final.");
  }
}