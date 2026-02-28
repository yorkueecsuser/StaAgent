class DoubleIndirectCase3 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("Reachable block in indirect1");
    } else {
      // This block is unreachable
      System.out.println("Unreachable block in indirect1");
    }
  }

  DoubleIndirectCase3() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("Reachable block in constructor");
    } else {
      // This block is unreachable
      System.out.println("Unreachable block in constructor");
    }
  }

  DoubleIndirectCase3(DoubleIndirectCase3 other) {
    other.indirect1();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("Reachable block in copy constructor");
    } else {
      // This block is unreachable
      System.out.println("Unreachable block in copy constructor");
    }
  }

  @Override
  public DoubleIndirectCase3 clone() throws CloneNotSupportedException {
    DoubleIndirectCase3 omc = (DoubleIndirectCase3) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("Reachable block in clone method");
    } else {
      // This block is unreachable
      System.out.println("Unreachable block in clone method");
    }
    return omc;
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("Reachable block in indirect2");
    } else {
      // This block is unreachable
      System.out.println("Unreachable block in indirect2");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("Reachable block in overridableMethod");
    } else {
      // This block is unreachable
      System.out.println("Unreachable block in overridableMethod");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("Reachable block in privateMethod");
    } else {
      // This block is unreachable
      System.out.println("Unreachable block in privateMethod");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("Reachable block in finalMethod");
    } else {
      // This block is unreachable
      System.out.println("Unreachable block in finalMethod");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean shouldRun = getConditionStatic();
    if (shouldRun) {
      // This block is reachable
      System.out.println("Reachable block in staticMethod");
    } else {
      // This block is unreachable
      System.out.println("Unreachable block in staticMethod");
    }
  }

  private boolean getCondition() {
    return false; // This will make the else block unreachable
  }

  private static boolean getConditionStatic() {
    return false; // This will make the else block unreachable
  }
}