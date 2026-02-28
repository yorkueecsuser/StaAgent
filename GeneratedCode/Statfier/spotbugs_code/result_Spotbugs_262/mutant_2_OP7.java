class DirectCase implements Cloneable {
  DirectCase() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    overridableMethod();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  DirectCase(DirectCase other) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    other.overridableMethod();
  }

  @Override
  public DirectCase clone() throws CloneNotSupportedException {
    DirectCase omc = (DirectCase) super.clone();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    omc.overridableMethod();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  void overridableMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    System.out.println("I am overridable.");
  }

  private void privateMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    System.out.println("I am private.");
  }

  final void finalMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    System.out.println("I am final.");
  }

  private static void staticMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    System.out.println("I am static.");
  }

  private boolean getCondition() {
    return false;
  }
}