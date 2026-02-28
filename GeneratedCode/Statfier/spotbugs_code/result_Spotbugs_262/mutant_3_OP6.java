class DirectCase implements Cloneable {
  DirectCase() {
    overridableMethod();
    privateMethod();
    finalMethod();
    staticMethod();
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() returns false
    }
  }

  DirectCase(DirectCase other) {
    other.overridableMethod();
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() returns false
    }
  }

  @Override
  public DirectCase clone() throws CloneNotSupportedException {
    DirectCase omc = (DirectCase) super.clone();
    omc.overridableMethod();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() returns false
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() returns false
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() returns false
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() returns false
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() returns false
    }
  }

  private boolean getCondition() {
    return false;
  }
}