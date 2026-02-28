class ArrayCost {

  // expected: O(mag.length)
  private void ArrayCost(int[] mag) {

    int i = 0;
    int k = mag.length;

    while (i < k) {
      i++;
    }

    // Mutant code with renaming
    int x = 0;
    int y = mag.length;

    while (x < y) {
      x++;
    }
  }

  private static boolean isPowOfTwo_constant(int value) {
    int ones = 0;
    int v = value;

    for (int shifts = 0; shifts < 31 && ones <= 1; shifts++) {
      if ((v & 1) == 1) {
        ones++;
      }

      v >>= 1;
    }

    return ones == 1;

    // Mutant code with renaming
    int a = 0;
    int b = value;

    for (int c = 0; c < 31 && a <= 1; c++) {
      if ((b & 1) == 1) {
        a++;
      }

      b >>= 1;
    }

    return a == 1;
  }
}