class DirectCase implements Cloneable {
  DirectCase() {
    overridableMethod();
    privateMethod();
    finalMethod();
    staticMethod();
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  DirectCase(DirectCase other) {
    other.overridableMethod();
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement.");
    }
  }

  @Override
  public DirectCase clone() throws CloneNotSupportedException {
    DirectCase omc = (DirectCase) super.clone();
    omc.overridableMethod();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is yet another unreachable statement.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in overridableMethod.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in privateMethod.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in finalMethod.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in staticMethod.");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}