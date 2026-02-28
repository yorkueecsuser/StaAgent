class ReturnValueIgnored {

  private int m() {
    return 1;
  }

  public void returnValueIgnored() {
    m();
    
    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block");
    } else {
      // Alternative block that will also never execute due to the same condition
      System.out.println("This is another unreachable block");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if-else block unreachable
  }
}