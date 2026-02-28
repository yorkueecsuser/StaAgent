class Bug1625248 {

  private static final int XXX = 0x100;

  private final int[] testData = new int[XXX + 1];

  private final double[] gradient = new double[(XXX + 1) * 8];

  private void initLattice() {

    int i, j, s1;

    for (i = 0; i < XXX; i++) {
      testData[i] = i;
    }

    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is unreachable because shouldRun is always false
      testData[0] = -1;
    } else {
      // This block will always execute
      testData[0] = 0;
    }

    while (--i > 0) {
      s1 = i << 3;
      for (j = 0; j < 8; j++) {
        gradient[i] = s1;
      }
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}