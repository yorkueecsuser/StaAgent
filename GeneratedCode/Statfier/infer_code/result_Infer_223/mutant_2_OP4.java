class ArrayCost {

  // expected: O(mag.length)
  private void ArrayCost(int[] mag) {

    int i = 0;
    int k = mag.length;

    while (i < k) {
      i++;
      // Inserting unreachable if-else branch
      boolean condition = isPowOfTwo_constant(0); // This will always return false due to the nature of the method
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code.");
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