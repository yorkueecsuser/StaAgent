class DoubleIndirectCase2 implements Cloneable {
  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("Reachable block in indirect2");
    } else {
      // This block is unreachable if condition is false
      System.out.println("Unreachable block in indirect2");
    }
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("Reachable block in indirect1");
    } else {
      // This block is unreachable if condition is false
      System.out.println("Unreachable block in indirect1");
    }
  }

  DoubleIndirectCase2() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("Reachable block in constructor");
    } else {
      // This block is unreachable if condition is false
      System.out.println("Unreachable block in constructor");
    }
  }

  DoubleIndirectCase2(DoubleIndirectCase2 other) {
    other.indirect1();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("Reachable block in copy constructor");
    } else {
      // This block is unreachable if condition is false
      System.out.println("Unreachable block in copy constructor");
    }
  }

  @Override
  public DoubleIndirectCase2 clone() throws CloneNotSupportedException {
    DoubleIndirectCase2 omc = (DoubleIndirectCase2) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("Reachable block in clone method");
    } else {
      // This block is unreachable if condition is false
      System.out.println("Unreachable block in clone method");
    }
    return omc;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("Reachable block in overridableMethod");
    } else {
      // This block is unreachable if condition is false
      System.out.println("Unreachable block in overridableMethod");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("Reachable block in privateMethod");
    } else {
      // This block is unreachable if condition is false
      System.out.println("Unreachable block in privateMethod");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("Reachable block in finalMethod");
    } else {
      // This block is unreachable if condition is false
      System.out.println("Unreachable block in finalMethod");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("Reachable block in staticMethod");
    } else {
      // This block is unreachable if condition is false
      System.out.println("Unreachable block in staticMethod");
    }
  }

  private static boolean getCondition() {
    return false; // This ensures the else block is effectively unreachable
  }
}