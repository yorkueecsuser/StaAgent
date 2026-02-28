class CompareToButNoEquals implements Comparable<CompareToButNoEquals> {

  @Override
  public int compareTo(CompareToButNoEquals arg0) {
    // TODO Auto-generated method stub
    return 0;

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable loop");
    }
  }

  private boolean getCondition() {
    // This method will always return false, making the while loop unreachable
    return false;
  }
}