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
      // This block is unreachable
      System.out.println("This is an unreachable block");
    }
    
    if (getBegin() == null) {
      return -1;
    }
    return getBegin().compareTo(other.getBegin());
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the condition unreachable
    return false;
  }
}