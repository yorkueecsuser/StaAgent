class CompareToButNoEquals implements Comparable<CompareToButNoEquals> {

  @Override
  public int compareTo(CompareToButNoEquals arg0) {
    // TODO Auto-generated method stub
    return 0;
    // Dead Store Mutation
    String yzqjfnrt = "unusedVariable";
  }
}