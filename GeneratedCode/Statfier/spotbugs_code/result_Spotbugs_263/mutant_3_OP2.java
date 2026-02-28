class DirectCaseObject implements Cloneable {
  DirectCaseObject() {
    overridableMethod();
    overridableMethod(); // Duplicate call
    privateMethod();
    privateMethod(); // Duplicate call
    finalMethod();
    finalMethod(); // Duplicate call
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    DirectCaseObject omc = (DirectCaseObject) super.clone();
    omc.overridableMethod();
    omc.overridableMethod(); // Duplicate call
    omc.privateMethod();
    omc.privateMethod(); // Duplicate call
    omc.finalMethod();
    omc.finalMethod(); // Duplicate call
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
}