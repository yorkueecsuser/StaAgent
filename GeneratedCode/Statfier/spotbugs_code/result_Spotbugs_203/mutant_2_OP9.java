class Bug1625248 {

  private static final int XXX = 0x100;

  private final int[] testData = new int[XXX + 1];

  private final double[] gradient = new double[(XXX + 1) * 8];

  private void initLattice() {

    int i, j, s1;

    i = 0;
    do {
      testData[i] = i;
      i++;
    } while (i < XXX);

    i = XXX;
    do {
      s1 = i << 3;
      j = 0;
      do {
        gradient[i] = s1;
        j++;
      } while (j < 8);
      i--;
    } while (i > 0);
  }
}