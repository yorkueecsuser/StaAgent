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
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }

    if (getBegin() == null) {
      return -1;
    }
    return getBegin().compareTo(other.getBegin());
  }

  private boolean getCondition() {
    // This method always returns false, making the while loop unreachable
    return false;
  }
}