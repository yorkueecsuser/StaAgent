class DoubleIndirectCase4 implements Cloneable {
  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This loop is unreachable.");
    }
  }

  DoubleIndirectCase4() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This loop is unreachable.");
    }
  }

  DoubleIndirectCase4(DoubleIndirectCase4 other) {
    other.indirect1();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This loop is unreachable.");
    }
  }

  @Override
  public DoubleIndirectCase4 clone() throws CloneNotSupportedException {
    DoubleIndirectCase4 omc = (DoubleIndirectCase4) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This loop is unreachable.");
    }
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This loop is unreachable.");
    }
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
    return false; // This method ensures the condition is always false, making the loop unreachable
  }
}