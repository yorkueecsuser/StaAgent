class Bug1926389 {
  public int avg(int i, int j, int[] elts) {
    int k = (i + j) / 2;
    System.out.println(k);

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int l = 0; conditionFor; l++) {
      // This loop is unreachable because conditionFor is always false
    }

    return elts[k];
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}