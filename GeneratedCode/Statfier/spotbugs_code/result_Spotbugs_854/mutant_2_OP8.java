class FloatingPointEquality {

  double sum(double n) {
    double result = 0;
    for (double count = 0.0; count!= n; count += 0.1) result += count;
    return result;
  }

  // Mutant code with renaming mutation operator applied
  double sumx(double x) {
    double a = 0;
    for (double b = 0.0; b!= x; b += 0.1) a += b;
    return a;
  }

  public static final double MY_DOUBLE = 4.5;

  boolean isMyDouble(double d) {
    return d == MY_DOUBLE;
  }

  // Mutant code with renaming mutation operator applied
  boolean isMyDoublex(double e) {
    return e == MY_DOUBLE;
  }
}