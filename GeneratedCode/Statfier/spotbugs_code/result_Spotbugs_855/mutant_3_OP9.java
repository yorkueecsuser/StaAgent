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

    int i = 1;
    do {
      float f = fConst / i * i;
      if (f!= fConst) // FE_FLOATING_POINT_EQUALITY
      {
        System.out.println("inexact float: " + i);
      }
      // The following expression should be false.
      if (Math.abs(f - fConst) >= fEpsilon) {
        System.out.println("epsilon too large: " + i);
      }
      i++;
    } while (i < 50);

    i = 50;
    do {
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
      i++;
    } while (i < 100);

    if (0.0d / 0.0d!= Double.NaN) {
      System.out.println("double NaN!= NaN");
    }

    i = 1;
    do {
      double d = dConst / i * i;
      if (d!= dConst) // FE_FLOATING_POINT_EQUALITY
      {
        System.out.println("inexact double: " + i);
      }
      // The following expression should be false.
      if (Math.abs(d - dConst) >= dEpsilon) {
        System.out.println("epsilon too large: " + i);
      }
      i++;
    } while (i < 50);

    i = 50;
    do {
      double d = dConst / i * i;
      if (d == dConst) // FE_FLOATING_POINT_EQUALITY
      {
      } else {
        System.out.println("inexact double: " + i);
      }
      // The following expression should be false.
      if (Math.abs(d - dConst) >= dEpsilon) {
        System.out.println("epsilon too large: " + i);
      }
      i++;
    } while (i < 100);
  }

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