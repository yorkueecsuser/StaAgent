class IndirectCase1 implements Cloneable {
  final void indirect() {
    overridableMethod();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This loop is unreachable.");
    }
  }

  IndirectCase1() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This loop is unreachable.");
    }
  }

  IndirectCase1(IndirectCase1 other) {
    other.indirect();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This loop is unreachable.");
    }
  }

  @Override
  public IndirectCase1 clone() throws CloneNotSupportedException {
    IndirectCase1 omc = (IndirectCase1) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This loop is unreachable.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This loop is unreachable.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This loop is unreachable.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This loop is unreachable.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}