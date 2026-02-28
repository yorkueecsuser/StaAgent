class DoubleIndirectCase1 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  DoubleIndirectCase1() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  DoubleIndirectCase1(DoubleIndirectCase1 other) {
    other.indirect1();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  @Override
  public DoubleIndirectCase1 clone() throws CloneNotSupportedException {
    DoubleIndirectCase1 omc = (DoubleIndirectCase1) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}