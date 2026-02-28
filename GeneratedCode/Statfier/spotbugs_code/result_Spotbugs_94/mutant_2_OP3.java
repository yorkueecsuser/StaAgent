class Bug2088311 implements Comparable<Bug2088311> {
  final int begin;

  Bug2088311(int b) {
    begin = b;
  }

  public Integer getBegin() {
    return begin;
  }

  @Override
  public int compareTo(Bug2088311 other) {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This is an unreachable if statement
      return 0;
    }
    if (getBegin() == null) {
      return -1;
    }
    return getBegin().compareTo(other.getBegin());
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the if statement unreachable
    return false;
  }
}