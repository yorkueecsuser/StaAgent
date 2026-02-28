class ArrayCost {

  // expected: O(mag.length)
  private void ArrayCost(int[] mag) {

    int i = 0;
    int k = mag.length;

    while (i < k) {
      i++;

      // Introduced unreachable if-else statement
      boolean shouldRun = false;
      if (shouldRun) {
        // This block is unreachable
        i = -1;
      } else {
        // Alternative block that will execute
        k = mag.length;
      }
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

      // Introduced unreachable if-else statement
      boolean shouldRun = false;
      if (shouldRun) {
        // This block is unreachable
        ones = 2;
      } else {
        // Alternative block that will execute
        v >>= 1;
      }
    }

    return ones == 1;
  }
}