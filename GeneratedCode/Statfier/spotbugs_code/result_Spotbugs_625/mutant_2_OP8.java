/**
 * @author pugh
 */
class CompareAgainstIntegerMaxValue {

  int report(int x) {
    for (int i = 0; i <= Integer.MAX_VALUE; i++) if (i * i == x) return i;
    return 0;
  }

  // Mutant code with renaming mutation operator applied
  int reportz(int x) {
    for (int j = 0; j <= Integer.MAX_VALUE; j++) if (j * j == x) return j;
    return 0;
  }

  int report2(int x) {
    if (x < 0 || x > Integer.MAX_VALUE) return -1;
    return x;
  }

  // Mutant code with renaming mutation operator applied
  int report2y(int x) {
    if (x < 0 || x > Integer.MAX_VALUE) return -1;
    return x;
  }
}