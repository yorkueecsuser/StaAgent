class FloatingPointEquality {

  double sum(double n) {
    double result = 0;
    for (double count = 0.0; count!= n; count += 0.1) {
      result += count;
      // Unreachable if statement mutation
      boolean condition = getUnreachableCondition();
      if (condition) {
        result -= count; // This line is logically unreachable
      }
    }
    return result;
  }

  public static final double MY_DOUBLE = 4.5;

  boolean isMyDouble(double d) {
    return d == MY_DOUBLE;
  }

  // Method to provide a dynamically determined condition that is always false
  private boolean getUnreachableCondition() {
    return false;
  }
}