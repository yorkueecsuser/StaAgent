class Bug1941450 {
  void method() {
    String good = new String(new char[0]); // DLS found
    String bad = new String(new char[0]); // DLS NOT found
    String good2 = new String(new char[0]); // DLS found
    String bad2 = new String(new char[0]); // DLS NOT found

    // Mutant code starts here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}