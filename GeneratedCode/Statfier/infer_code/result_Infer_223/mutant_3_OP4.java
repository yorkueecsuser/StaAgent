class ArrayCost {

  // expected: O(mag.length)
  private void ArrayCost(int[] mag) {

    int i = 0;
    int k = mag.length;

    while (i < k) {
      i++;
      // Mutant: Inserting an unreachable if-else statement
      boolean shouldRun = false; // This variable ensures the if-else is unreachable but not due to a compile-time constant
      if (shouldRun) {
        System.out.println("This will never be printed");
      } else {
        System.out.println("This will also never be printed");
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
    }

    return ones == 1;
  }
}