class DirectCaseObject implements Cloneable {
  DirectCaseObject() {
    overridableMethod();
    privateMethod();
    finalMethod();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in constructor.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in constructor.");
    }
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    DirectCaseObject omc = (DirectCaseObject) super.clone();
    omc.overridableMethod();
    omc.privateMethod();
    omc.finalMethod();
    boolean conditionClone = getCondition();
    if (conditionClone) {
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
    boolean conditionOverridable = getCondition();
    if (conditionOverridable) {
      // Some unreachable code
      System.out.println("This is unreachable code in overridableMethod.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in overridableMethod.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean conditionPrivate = getCondition();
    if (conditionPrivate) {
      // Some unreachable code
      System.out.println("This is unreachable code in privateMethod.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in privateMethod.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean conditionFinal = getCondition();
    if (conditionFinal) {
      // Some unreachable code
      System.out.println("This is unreachable code in finalMethod.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in finalMethod.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}