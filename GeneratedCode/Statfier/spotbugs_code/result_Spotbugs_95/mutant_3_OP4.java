class CompareToButNoEquals implements Comparable<CompareToButNoEquals> {

  @Override
  public int compareTo(CompareToButNoEquals arg0) {
    // TODO Auto-generated method stub
    return 0;

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will also never execute because the if condition is always false
      System.out.println("This is another unreachable block");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if-else block unreachable
  }
}