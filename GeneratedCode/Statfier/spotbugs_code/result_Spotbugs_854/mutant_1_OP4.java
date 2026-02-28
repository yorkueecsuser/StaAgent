class FloatingPointEquality {

  double sum(double n) {
    double result = 0;
    for (double count = 0.0; count!= n; count += 0.1) result += count;
    
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      result += 1.0; // This will never be executed
    } else {
      result -= 1.0; // This will also never be executed
    }
    
    return result;
  }

  public static final double MY_DOUBLE = 4.5;

  boolean isMyDouble(double d) {
    return d == MY_DOUBLE;
  }

  // Method to provide a dynamic condition for the mutant
  private boolean getCondition() {
    return false; // This ensures the condition is always false at runtime
  }
}