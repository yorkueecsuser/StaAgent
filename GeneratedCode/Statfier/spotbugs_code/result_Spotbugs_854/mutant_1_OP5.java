class FloatingPointEquality {

  double sum(double n) {
    double result = 0;
    for (double count = 0.0; count!= n; count += 0.1) result += count;
    
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        result += 1.0; // This case is unreachable because condition is never set to true
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

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }
}