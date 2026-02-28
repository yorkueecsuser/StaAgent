class Bug1926389 {
  public int avg(int i, int j, int[] elts) {
    int k = (i + j) / 2;
    System.out.println(k);
    
    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case will never be executed
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case will also never be executed due to the nature of the boolean
        System.out.println("This is also an unreachable case.");
        break;
    }
    
    return elts[k];
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}