class DirectCase implements Cloneable {
  DirectCase() {
    overridableMethod();
    privateMethod();
    finalMethod();
    staticMethod();
    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  DirectCase(DirectCase other) {
    other.overridableMethod();
    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  @Override
  public DirectCase clone() throws CloneNotSupportedException {
    DirectCase omc = (DirectCase) super.clone();
    omc.overridableMethod();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  private boolean getCondition() {
    return false; // This ensures the else block is unreachable
  }
}