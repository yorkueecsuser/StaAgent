import java.math.BigInteger;

class UnnecessaryMathTest {
  static {
    // Bug 1196294 - Don't report in clinit
    BigInteger check = BigInteger.valueOf((long) Math.floor(Integer.MAX_VALUE / 127.5));
  }

  public void test() {
    double a;
    double b; // Added for mutation

    a = Math.abs(1.5);
    b = Math.abs(1.5); // Mutant
    a = Math.acos(0.0);
    b = Math.acos(0.0); // Mutant
    a = Math.acos(1.0);
    b = Math.acos(1.0); // Mutant
    a = Math.asin(0.0);
    b = Math.asin(0.0); // Mutant
    a = Math.asin(1.0);
    b = Math.asin(1.0); // Mutant
    a = Math.atan(0.0);
    b = Math.atan(0.0); // Mutant
    a = Math.atan(1.0);
    b = Math.atan(1.0); // Mutant
    a = Math.cbrt(0.0);
    b = Math.cbrt(0.0); // Mutant
    a = Math.cbrt(1.0);
    b = Math.cbrt(1.0); // Mutant
    a = Math.ceil(1.5);
    b = Math.ceil(1.5); // Mutant
    a = Math.cos(0.0);
    b = Math.cos(0.0); // Mutant
    a = Math.cosh(0.0);
    b = Math.cosh(0.0); // Mutant
    a = Math.exp(0.0);
    b = Math.exp(0.0); // Mutant
    a = Math.exp(1.0);
    b = Math.exp(1.0); // Mutant
    a = Math.floor(1.5);
    b = Math.floor(1.5); // Mutant
    a = Math.log(0.0);
    b = Math.log(0.0); // Mutant
    a = Math.log(1.0);
    b = Math.log(1.0); // Mutant
    a = Math.log10(0.0);
    b = Math.log10(0.0); // Mutant
    a = Math.log10(1.0);
    b = Math.log10(1.0); // Mutant
    a = Math.pow(10.0, 0.0);
    b = Math.pow(10.0, 0.0); // Mutant
    a = Math.pow(10.0, 1.0);
    b = Math.pow(10.0, 1.0); // Mutant
    a = Math.rint(1.5);
    b = Math.rint(1.5); // Mutant
    a = Math.round(1.5);
    b = Math.round(1.5); // Mutant
    a = Math.sin(0.0);
    b = Math.sin(0.0); // Mutant
    a = Math.sinh(0.0);
    b = Math.sinh(0.0); // Mutant
    a = Math.sqrt(0.0);
    b = Math.sqrt(0.0); // Mutant
    a = Math.sqrt(1.0);
    b = Math.sqrt(1.0); // Mutant
    a = Math.tan(0.0);
    b = Math.tan(0.0); // Mutant
    a = Math.tanh(0.0);
    b = Math.tanh(0.0); // Mutant
    a = Math.toDegrees(0.0);
    b = Math.toDegrees(0.0); // Mutant
    a = Math.toDegrees(1.0);
    b = Math.toDegrees(1.0); // Mutant
    a = Math.toRadians(0.0);
    b = Math.toRadians(0.0); // Mutant
  }
}