class IndirectCase2 implements Cloneable {
  IndirectCase2() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This loop is unreachable.");
    }
  }

  IndirectCase2(IndirectCase2 other) {
    other.indirect();
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This loop is unreachable.");
    }
  }

  @Override
  public IndirectCase2 clone() throws CloneNotSupportedException {
    IndirectCase2 omc = (IndirectCase2) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  final void indirect() {
    overridableMethod();
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This loop is unreachable.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This loop is unreachable.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This loop is unreachable.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This loop is unreachable.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This loop is unreachable.");
    }
  }

  private boolean getCondition() {
    return false; // This ensures the loop remains unreachable
  }
}