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
    if (getBegin() == null) {
      return -1;
    }
    
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case to satisfy switch requirement
        break;
    }

    return getBegin().compareTo(other.getBegin());
  }

  private boolean getCondition() {
    // This method returns false, making the switch statement unreachable
    return false;
  }
}