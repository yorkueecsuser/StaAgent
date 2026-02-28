class Bug1926389 {
  public int avg(int i, int j, int[] elts) {
    int k = (i + j) / 2;
    System.out.println(k);
    
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        int unreachableVar = 42;
        System.out.println("This is unreachable: " + unreachableVar);
        break;
      case 1:
        // This case is always executed
        break;
    }
    
    return elts[k];
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}