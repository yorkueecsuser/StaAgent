class ArrayCost {

  // expected: O(mag.length)
  private void ArrayCost(int[] mag) {

    int i = 0;
    int k = mag.length;

    do {
      i++;
    } while (i < k);
  }

  private static boolean isPowOfTwo_constant(int value) {
    int ones = 0;
    int v = value;

    do {
      if ((v & 1) == 1) {
        ones++;
      }

      v >>= 1;
    } while (shifts < 31 && ones <= 1);

    return ones == 1;
  }
}