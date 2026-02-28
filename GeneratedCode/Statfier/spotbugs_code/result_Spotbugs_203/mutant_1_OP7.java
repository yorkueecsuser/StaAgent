class Bug1625248 {

  private static final int XXX = 0x100;

  private final int[] testData = new int[XXX + 1];

  private final double[] gradient = new double[(XXX + 1) * 8];

  private void initLattice() {

    int i, j, s1;

    for (i = 0; i < XXX; i++) {
      testData[i] = i;
    }

    // Inserting an unreachable while loop
    boolean conditionWhile = getUnreachableCondition();
    while (conditionWhile) {
      // This loop is unreachable
      System.out.println("This is an unreachable loop");
    }

    while (--i > 0) {
      s1 = i << 3;
      for (j = 0; j < 8; j++) {
        gradient[i] = s1;
      }
    }
  }

  // Method to provide a dynamically determined condition that is always false
  private boolean getUnreachableCondition() {
    return false;
  }
}