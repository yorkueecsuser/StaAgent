class DoubleIndirectCase1 implements Cloneable {
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

  final void indirect2() {
    indirect1();
    overridableMethod();
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This is another unreachable loop.");
    }
  }

  DoubleIndirectCase1() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("Yet another unreachable loop in constructor.");
    }
  }

  DoubleIndirectCase1(DoubleIndirectCase1 other) {
    other.indirect1();
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("Unreachable loop in copy constructor.");
    }
  }

  @Override
  public DoubleIndirectCase1 clone() throws CloneNotSupportedException {
    DoubleIndirectCase1 omc = (DoubleIndirectCase1) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("Unreachable loop in clone method.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("Unreachable loop in overridable method.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("Unreachable loop in private method.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("Unreachable loop in final method.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("Unreachable loop in static method.");
    }
  }

  private boolean getCondition() {
    return false; // This ensures the loop is unreachable at runtime
  }
}