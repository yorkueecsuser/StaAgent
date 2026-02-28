/**
 * @author pugh
 */
class CompareAgainstIntegerMaxValue {

  int report(int x) {
    int i = 0;
    do {
      if (i * i == x) return i;
      i++;
    } while (i <= Integer.MAX_VALUE);
    return 0;
  }

  int report2(int x) {
    if (x < 0 || x > Integer.MAX_VALUE) return -1;
    return x;
  }
}