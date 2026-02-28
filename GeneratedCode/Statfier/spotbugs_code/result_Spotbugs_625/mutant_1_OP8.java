/**
 * @author pugh
 */
class CompareAgainstIntegerMaxValue {

  int report(int x) {
    for (int i = 0; i <= Integer.MAX_VALUE; i++) if (i * i == x) return i;
    return 0;
  }

  int report2(int x) {
    if (x < 0 || x > Integer.MAX_VALUE) return -1;
    return x;
  }

  // Mutated code
  int reporta(int a) {
    for (int b = 0; b <= Integer.MAX_VALUE; b++) if (b * b == a) return b;
    return 0;
  }

  int report2c(int c) {
    if (c < 0 || c > Integer.MAX_VALUE) return -1;
    return c;
  }
}