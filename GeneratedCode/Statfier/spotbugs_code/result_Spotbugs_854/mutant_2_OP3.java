class FloatingPointEquality {

  double sum(double n) {
    double result = 0;
    for (double count = 0.0; count!= n; count += 0.1) {
      result += count;
      // Introduced unreachable if statement
      boolean condition = getUnreachableCondition();
      if (condition) {
        result -= count; // This line will never be executed
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