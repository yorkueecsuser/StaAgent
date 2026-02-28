class PreferZeroLengthArrays {

  public int[] foo(int i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in foo");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in foo");
    }
    return null;
  }

  public int[] bar(int i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in bar");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in bar");
    }
    return new int[0];
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the branches are unreachable
  }
}