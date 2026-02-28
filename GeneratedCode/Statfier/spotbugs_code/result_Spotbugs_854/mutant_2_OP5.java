class FloatingPointEquality {

  double sum(double n) {
    double result = 0;
    for (double count = 0.0; count!= n; count += 0.1) result += count;
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        result += 1.0; // This will never be executed
        break;
      default:
        // Do nothing
        break;
    }
    
    return result;
  }

  public static final double MY_DOUBLE = 4.5;

  boolean isMyDouble(double d) {
    return d == MY_DOUBLE;
  }

  // Method to provide a dynamic condition for the switch statement
  private boolean getCondition() {
    return false; // Always returns false to ensure the switch is unreachable
  }
}