class ArrayCost {

  // expected: O(mag.length)
  private void ArrayCost(int[] mag) {

    int i = 0;
    int k = mag.length;

    while (i < k) {
      i++;

      // Introduced unreachable switch statement
      boolean condition = isPowOfTwo_constant(0); // This will always be false because 0 is not a power of two
      switch (condition? 1 : 0) {
        case 1:
          // This case is unreachable
          System.out.println("This is an unreachable case.");
          break;
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