class CompareToButNoEquals implements Comparable<CompareToButNoEquals> {

  @Override
  public int compareTo(CompareToButNoEquals arg0) {
    // TODO Auto-generated method stub
    return 0;

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }
  }

  private boolean getCondition() {
    return false;
  }
}