class UnreadFields {
  int x = 1;

  // Added mutant code to introduce an unreachable switch statement
  public void someMethod() {
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse? 0 : 1) {
      case 0:
        // This case is unreachable because alwaysFalse is always false
        System.out.println("This will never be printed");
        break;
      case 1:
        // This case is reachable
        System.out.println("This will be printed");
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}