class IgnoredTrim {

  public void f(String s) {
    s.trim();

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case to avoid unreachable statement error
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}