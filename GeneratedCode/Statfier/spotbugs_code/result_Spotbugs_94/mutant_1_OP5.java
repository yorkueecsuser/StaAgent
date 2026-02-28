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
    switch (unreachableCondition? 0 : 1) {
      case 0:
        // This case is unreachable because unreachableCondition is always false
        System.out.println("This is an unreachable switch case.");
        break;
      default:
        // Default case to ensure the switch is valid
        break;
    }

    if (getBegin() == null) {
      return -1;
    }
    return getBegin().compareTo(other.getBegin());
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the switch case unreachable
    return false;
  }
}