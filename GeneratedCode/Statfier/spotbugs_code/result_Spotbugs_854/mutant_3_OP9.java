class FloatingPointEquality {

  double sum(double n) {
    double result = 0;
    double count = 0.0;
    do {
      result += count;
      count += 0.1;
    } while (count!= n);
    return result;
  }

  public static final double MY_DOUBLE = 4.5;

  boolean isMyDouble(double d) {
    return d == MY_DOUBLE;
  }
}