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
    for (int j = 50; j < 100; ++j) { // Renamed 'i' to 'j'
      float g = fConst / j * j; // Renamed 'f' to 'g'
      if (g == fConst) // FE_FLOATING_POINT_EQUALITY
      {
      } else {
        System.out.println("inexact float: " + j); // Renamed 'i' to 'j'
      }
      // The following expression should be false.
      if (Math.abs(g - fConst) >= fEpsilon) {
        System.out.println("epsilon too large: " + j); // Renamed 'i' to 'j'
      }
    }

    if (0.0d / 0.0d!= Double.NaN) {
      System.out.println("double NaN!= NaN");
    }

    for (int k = 1; k < 50; ++k) { // Renamed 'i' to 'k'
      double h = dConst / k * k; // Renamed 'd' to 'h'
      if (h!= dConst) // FE_FLOATING_POINT_EQUALITY
      {
        System.out.println("inexact double: " + k); // Renamed 'i' to 'k'
      }
      // The following expression should be false.
      if (Math.abs(h - dConst) >= dEpsilon) {
        System.out.println("epsilon too large: " + k); // Renamed 'i' to 'k'
      }
    }
    for (int l = 50; l < 100; ++l) { // Renamed 'i' to 'l'
      double m = dConst / l * l; // Renamed 'd' to'm'
      if (m == dConst) // FE_FLOATING_POINT_EQUALITY
      {
      } else {
        System.out.println("inexact double: " + l); // Renamed 'i' to 'l'
      }
      // The following expression should be false.
      if (Math.abs(m - dConst) >= dEpsilon) {
        System.out.println("epsilon too large: " + l); // Renamed 'i' to 'l'
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