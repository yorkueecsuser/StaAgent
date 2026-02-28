class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);

      // Mutant code: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will execute if shouldRun is true
        System.out.println("This is the reachable block.");
      } else {
        // This block is unreachable because shouldRun is always false
        System.out.println("This is the unreachable block.");
      }
    }

    class Inner2 {}

    // Method to provide a dynamic condition
    private boolean getCondition() {
      return false;
    }
  }
}