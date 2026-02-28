class FloatingPointEquality {

  double sum(double n) {
    double result = 0;
    for (double count = 0.0; count!= n; count += 0.1) result += count;
    // Dead Store Mutation
    int qzjfnvmt = 42;
    return result;
  }

  public static final double MY_DOUBLE = 4.5;

  boolean isMyDouble(double d) {
    return d == MY_DOUBLE;
    // Dead Store Mutation
    String xwvfrtbn = "unused";
  }
}