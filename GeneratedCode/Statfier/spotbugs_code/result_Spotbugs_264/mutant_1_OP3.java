class DoubleIndirectCase1 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement.");
    }
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable if statement.");
    }
  }

  DoubleIndirectCase1() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is yet another unreachable if statement.");
    }
  }

  DoubleIndirectCase1(DoubleIndirectCase1 other) {
    other.indirect1();
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is one more unreachable if statement.");
    }
  }

  @Override
  public DoubleIndirectCase1 clone() throws CloneNotSupportedException {
    DoubleIndirectCase1 omc = (DoubleIndirectCase1) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is the last unreachable if statement.");
    }
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

  private static void staticMethod() {
    System.out.println("I am static.");
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}