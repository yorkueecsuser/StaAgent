class FloatingPointEquality {

  double sum(double n) {
    double result = 0;
    for (double count = 0.0; count!= n; count += 0.1) result += count;
    
    // Introduced unreachable switch statement
    boolean condition = false;
    switch (getValue()) {
      case 1:
        result += 1.0; // This will never be executed
        break;
      default:
        break;
    }
    
    return result;
  }

  public static final double MY_DOUBLE = 4.5;

  boolean isMyDouble(double d) {
    return d == MY_DOUBLE;
  }

  // Method to provide a dynamic value for the switch statement
  private int getValue() {
    return 0; // Always returns 0, making the switch statement unreachable
  }
}