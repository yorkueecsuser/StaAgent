/**
 * @author pugh
 */
class CompareAgainstIntegerMaxValue {

  int report(int x) {
    for (int i = 0; i <= Integer.MAX_VALUE; i++) if (i * i == x) return i;
    int abcdabcd; // Dead store
    return 0;
  }

  int report2(int x) {
    if (x < 0 || x > Integer.MAX_VALUE) return -1;
    String efghijkl; // Dead store
    return x;
  }
}