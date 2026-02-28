class DoubleIndirectCase2 implements Cloneable {
  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in indirect2.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in indirect2.");
    }
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in indirect1.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in indirect1.");
    }
  }

  DoubleIndirectCase2() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in constructor.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in constructor.");
    }
  }

  DoubleIndirectCase2(DoubleIndirectCase2 other) {
    other.indirect1();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in copy constructor.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in copy constructor.");
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
      // Some unreachable code
      System.out.println("This is unreachable code in clone method.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in clone method.");
    }
    return omc;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in overridableMethod.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in overridableMethod.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in privateMethod.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in privateMethod.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in finalMethod.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in finalMethod.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in staticMethod.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in staticMethod.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is dynamically determined but always returns false
  }
}