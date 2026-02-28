class ArrayCost {

  // expected: O(mag.length)
  private void ArrayCost(int[] mag) {

    int i = 0;
    int k = mag.length;

    while (i < k) {
      i++;
    }

    // Inserted unreachable while loop
    boolean conditionWhile = isPowOfTwo_constant(0); // This will always be false because 0 is not a power of two
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop");
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