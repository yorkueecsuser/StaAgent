class IndirectCase2 implements Cloneable {
  IndirectCase2() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is the reachable part
      System.out.println("This is reachable.");
    } else {
      // This is the unreachable part due to shouldRun always being false
      System.out.println("This is unreachable.");
    }
  }

  IndirectCase2(IndirectCase2 other) {
    other.indirect();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is the reachable part
      System.out.println("This is reachable.");
    } else {
      // This is the unreachable part due to shouldRun always being false
      System.out.println("This is unreachable.");
    }
  }

  @Override
  public IndirectCase2 clone() throws CloneNotSupportedException {
    IndirectCase2 omc = (IndirectCase2) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is the reachable part
      System.out.println("This is reachable.");
    } else {
      // This is the unreachable part due to shouldRun always being false
      System.out.println("This is unreachable.");
    }
    return omc;
  }

  final void indirect() {
    overridableMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is the reachable part
      System.out.println("This is reachable.");
    } else {
      // This is the unreachable part due to shouldRun always being false
      System.out.println("This is unreachable.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is the reachable part
      System.out.println("This is reachable.");
    } else {
      // This is the unreachable part due to shouldRun always being false
      System.out.println("This is unreachable.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is the reachable part
      System.out.println("This is reachable.");
    } else {
      // This is the unreachable part due to shouldRun always being false
      System.out.println("This is unreachable.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is the reachable part
      System.out.println("This is reachable.");
    } else {
      // This is the unreachable part due to shouldRun always being false
      System.out.println("This is unreachable.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is the reachable part
      System.out.println("This is reachable.");
    } else {
      // This is the unreachable part due to shouldRun always being false
      System.out.println("This is unreachable.");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}