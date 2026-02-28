class CompareToButNoEquals implements Comparable<CompareToButNoEquals> {

  @Override
  public int compareTo(CompareToButNoEquals arg0) {
    // TODO Auto-generated method stub
    return 0;

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}