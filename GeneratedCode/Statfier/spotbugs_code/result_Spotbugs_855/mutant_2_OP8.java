class TestFloatEquality {
  public static final double COIN_100_WEIGHT = 4.8;

  public boolean validCoin100(double weight) {
    return weight == COIN_100_WEIGHT;
  }

  public static void main(String[] args) {
    final float fConst = 1.0f;
    final double dConst = 1.0d;
    final float fEpsilon =.0000001f;
    final double dEpsilon =.000000000000001d;

    if (0.0f / 0.0f!= Float.NaN) {
      System.out.println("float NaN!= NaN");
    }

    for (int i = 1; i < 50; ++i) {
      float f = fConst / i * i;
      if (f!= fConst) // FE_FLOATING_POINT_EQUALITY
      {
        System.out.println("inexact float: " + i);
      }
      // The following expression should be false.
      if (Math.abs(f - fConst) >= fEpsilon) {
        System.out.println("epsilon too large: " + i);
      }
    }
    for (int i = 50; i < 100; ++i) {
      float f = fConst / i * i;
      if (f == fConst) // FE_FLOATING_POINT_EQUALITY
      {
      } else {
        System.out.println("inexact float: " + i);
      }
      // The following expression should be false.
      if (Math.abs(f - fConst) >= fEpsilon) {
        System.out.println("epsilon too large: " + i);
      }
    }

    if (0.0d / 0.0d!= Double.NaN) {
      System.out.println("double NaN!= NaN");
    }

    for (int x = 1; x < 50; ++x) { // Renamed 'i' to 'x'
      double d = dConst / x * x;
      if (d!= dConst) // FE_FLOATING_POINT_EQUALITY
      {
        System.out.println("inexact double: " + x);
      }
      // The following expression should be false.
      if (Math.abs(d - dConst) >= dEpsilon) {
        System.out.println("epsilon too large: " + x);
      }
    }
    for (int y = 50; y < 100; ++y) { // Renamed 'i' to 'y'
      double d = dConst / y * y;
      if (d == dConst) // FE_FLOATING_POINT_EQUALITY
      {
      } else {
        System.out.println("inexact double: " + y);
      }
      // The following expression should be false.
      if (Math.abs(d - dConst) >= dEpsilon) {
        System.out.println("epsilon too large: " + y);
      }
    }
  }

  double sum(double n) {
    double result = 0;
    for (double count = 0.0; count!= n; count += 0.1) result += count;
    return result;
  }

  public static final double MY_DOUBLE = 4.5;

  boolean isMyDouble(double d) {
    return d == MY_DOUBLE;
  }
}