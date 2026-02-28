class Bug1926389 {
  public int avg(int i, int j, int[] elts) {
    int k = (i + j) / 2;
    System.out.println(k);
    
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int m = 0; conditionFor; m++) {
      // This loop is unreachable because getCondition() will always return false
    }
    
    return elts[k];
  }

  private boolean getCondition() {
    return false;
  }
}