class DirectCaseObject implements Cloneable {
  DirectCaseObject() {
    overridableMethod();
    privateMethod();
    finalMethod();
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement.");
    }
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

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}