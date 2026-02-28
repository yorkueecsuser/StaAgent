class FloatingPointEquality {

  double sum(double n) {
    double result = 0;
    for (double count = 0.0; count!= n; count += 0.1) result += count;
    return result;
  }

  // Mutant with renamed variable'result' to 'a'
  double sumMutant(double n) {
    double a = 0;
    for (double count = 0.0; count!= n; count += 0.1) a += count;
    return a;
  }

  public static final double MY_DOUBLE = 4.5;

  boolean isMyDouble(double d) {
    return d == MY_DOUBLE;
  }

  // Mutant with renamed variable 'd' to 'b'
  boolean isMyDoubleMutant(double b) {
    return b == MY_DOUBLE;
  }
}