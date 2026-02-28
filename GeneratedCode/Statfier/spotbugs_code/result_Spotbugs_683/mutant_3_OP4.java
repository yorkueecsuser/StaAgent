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

    // Mutant: Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      result -= x.hashCode(); // This branch is intended to be unreachable
    } else {
      result += x.hashCode(); // This branch is also intended to be unreachable
    }

    return result;
  }

  // Method to provide a dynamic condition that will make the if-else branch unreachable
  private boolean getCondition() {
    return false; // This method always returns false, making the if-else branch unreachable
  }
}