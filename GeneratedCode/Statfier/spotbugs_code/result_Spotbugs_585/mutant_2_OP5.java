class InstanceOfInteraction {
  int f(Object x, boolean b) {
    if (x == null) System.out.println("x is null");
    if (b) System.out.println("b is true");
    // at this point, X is NCP
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case true:
        System.out.println("This is an unreachable switch case");
        break;
      default:
        System.out.println("Default case of unreachable switch");
        break;
    }
    if (x instanceof String) return 0;
    return x.hashCode();
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}