class DoubleIndirectCase2 implements Cloneable {
  final void indirect2() {
    indirect1();
    overridableMethod();
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  DoubleIndirectCase2() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  DoubleIndirectCase2(DoubleIndirectCase2 other) {
    other.indirect1();
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  @Override
  public DoubleIndirectCase2 clone() throws CloneNotSupportedException {
    DoubleIndirectCase2 omc = (DoubleIndirectCase2) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is an unreachable loop.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}