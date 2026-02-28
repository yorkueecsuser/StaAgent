class IndirectCase1 implements Cloneable {
  final void indirect() {
    overridableMethod();
    // Inserting unreachable for loop
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
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  IndirectCase1(IndirectCase1 other) {
    other.indirect();
    // Inserting unreachable for loop
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
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}