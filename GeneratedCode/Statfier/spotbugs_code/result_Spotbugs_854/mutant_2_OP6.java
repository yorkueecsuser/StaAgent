class FloatingPointEquality {

  double sum(double n) {
    double result = 0;
    for (double count = 0.0; count!= n; count += 0.1) result += count;
    return result;
  }

  public static final double MY_DOUBLE = 4.5;

  boolean isMyDouble(double d) {
    return d == MY_DOUBLE;
  }

  // Unreachable for loop mutant
  boolean getCondition() {
    return false;
  }

  void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
      System.out.println("This loop is unreachable");
    }
  }
}