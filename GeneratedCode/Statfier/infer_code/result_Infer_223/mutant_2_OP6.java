class ArrayCost {

  // expected: O(mag.length)
  private void ArrayCost(int[] mag) {

    int i = 0;
    int k = mag.length;

    while (i < k) {
      i++;
    }

    // Introduced unreachable for loop according to the mutation operator
    boolean conditionFor = false; // This variable ensures the loop is unreachable
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
      System.out.println("This loop is unreachable");
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