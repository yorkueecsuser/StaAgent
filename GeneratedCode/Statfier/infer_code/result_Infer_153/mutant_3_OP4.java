class ReturnValueIgnored {

  private int m() {
    return 1;
  }

  public void returnValueIgnored() {
    m();

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Code that should never run
      System.out.println("This will never be printed");
    } else {
      // Alternative code that should also never run
      System.out.println("This will also never be printed");
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else block unreachable
    return false;
  }
}