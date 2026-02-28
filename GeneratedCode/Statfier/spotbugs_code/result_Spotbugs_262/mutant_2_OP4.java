class DirectCase implements Cloneable {
  DirectCase() {
    overridableMethod();
    privateMethod();
    finalMethod();
    staticMethod();
    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code due to condition always being false.");
    }
  }

  DirectCase(DirectCase other) {
    other.overridableMethod();
    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code due to condition always being false.");
    }
  }

  @Override
  public DirectCase clone() throws CloneNotSupportedException {
    DirectCase omc = (DirectCase) super.clone();
    omc.overridableMethod();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code due to condition always being false.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code due to condition always being false.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code due to condition always being false.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code due to condition always being false.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code due to condition always being false.");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is always false, making the else block unreachable
  }
}