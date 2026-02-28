class DirectCaseObject implements Cloneable {
  DirectCaseObject() {
    overridableMethod();
    privateMethod();
    finalMethod();
    // Unreachable for loop mutation
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    DirectCaseObject omc = (DirectCaseObject) super.clone();
    omc.overridableMethod();
    omc.privateMethod();
    omc.finalMethod();
    // Unreachable for loop mutation
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
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

  private boolean getCondition() {
    return false;
  }
}