class InstanceOfInteraction {
  int f(Object x, boolean b) {
    if (x == null) System.out.println("x is null");
    if (b) System.out.println("b is true");
    // at this point, X is NCP
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // This switch is unreachable because condition is never true
      case 0:
        System.out.println("This is an unreachable switch case");
        break;
    }
    if (x instanceof String) return 0;
    return x.hashCode();
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }
}