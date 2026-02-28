class DirectCaseObject implements Cloneable {
  DirectCaseObject() {
    overridableMethod();
    privateMethod();
    finalMethod();
    // Dead Store Mutation
    String abcdefgh = "unusedVariable";
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
    // Dead Store Mutation
    int hijklmno = 42;
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Dead Store Mutation
    boolean pqrstuvw = true;
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Dead Store Mutation
    double xyzabcde = 3.14;
  }
}