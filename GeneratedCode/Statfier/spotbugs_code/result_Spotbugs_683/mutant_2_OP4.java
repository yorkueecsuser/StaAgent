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

    // Inserted unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      result -= x.hashCode(); // This branch is logically unreachable if getCondition() always returns false
    } else {
      result += x.hashCode(); // This branch will always execute if getCondition() always returns false
    }

    return result;
  }

  // Method to provide a dynamic condition that can be used to make the if-else branch unreachable
  private boolean getCondition() {
    return false; // This ensures the if branch is unreachable
  }
}