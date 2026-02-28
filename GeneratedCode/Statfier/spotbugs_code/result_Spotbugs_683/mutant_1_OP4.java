class UseCheckUse {
  final Object x;

  UseCheckUse(Object x) {
    this.x = x;
  }

  int f(boolean b) {
    int result = x.hashCode();
    if (x == null) {
      System.out.println("x is null");
    }
    if (b) result *= x.hashCode();
    else result += x.hashCode();

    // Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable");
    } else {
      // This branch is unreachable because getCondition() will always return true
      System.out.println("This is unreachable");
    }

    return result;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return true;
  }
}