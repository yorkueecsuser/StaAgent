class ArrayCost {

  // expected: O(mag.length)
  private void ArrayCost(int[] mag) {

    int i = 0;
    int k = mag.length;

    while (i < k) {
      i++;
    }
    
    // Mutated code
    int a = 0;
    int b = mag.length;

    while (a < b) {
      a++;
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
    
    // Mutated code
    int x = 0;
    int y = value;

    for (int z = 0; z < 31 && x <= 1; z++) {
      if ((y & 1) == 1) {
        x++;
      }

      y >>= 1;
    }

    return x == 1;
  }
}