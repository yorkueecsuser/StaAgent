class FloatingPointEquality {

  double sum(double n) {
    double result = 0;
    for (double count = 0.0; count!= n; count += 0.1) result += count;
    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      result += 1.0; // This branch is intended to be unreachable
    } else {
      result -= 1.0; // This branch is also intended to be unreachable
    }
    return result;
  }

  public static final double MY_DOUBLE = 4.5;

  boolean isMyDouble(double d) {
    return d == MY_DOUBLE;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}