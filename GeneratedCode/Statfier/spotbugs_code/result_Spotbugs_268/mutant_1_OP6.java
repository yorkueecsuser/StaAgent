class DoubleIndirectCase5 implements Cloneable {
  DoubleIndirectCase5() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This loop is unreachable.");
    }
  }

  DoubleIndirectCase5(DoubleIndirectCase5 other) {
    other.indirect1();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This loop is unreachable.");
    }
  }

  @Override
  public DoubleIndirectCase5 clone() throws CloneNotSupportedException {
    DoubleIndirectCase5 omc = (DoubleIndirectCase5) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This loop is unreachable.");
    }
    return omc;
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

  final void indirect2() {
    indirect1();
    overridableMethod();
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
    return false;
  }
}