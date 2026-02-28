class IndirectCase1 implements Cloneable {
  final void indirect() {
    overridableMethod();
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  IndirectCase1() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  IndirectCase1(IndirectCase1 other) {
    other.indirect();
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  @Override
  public IndirectCase1 clone() throws CloneNotSupportedException {
    IndirectCase1 omc = (IndirectCase1) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}