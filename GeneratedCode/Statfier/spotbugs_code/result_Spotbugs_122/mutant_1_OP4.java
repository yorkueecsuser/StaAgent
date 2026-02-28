class Bar {
  static Class other;

  static {
    other = Foo.other;
    
    // Mutant code starts here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
    } else {
      // This is an unreachable block because shouldRun is never set to true
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the else block is unreachable
  }
}