class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);

      // Mutant code: Adding an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will run if shouldRun is true");
      } else {
        System.out.println("This is unreachable because shouldRun is always false");
      }
    }

    class Inner2 {}

    // Method to provide a dynamic condition
    private boolean getCondition() {
      return false; // This ensures the else block is theoretically unreachable
    }
  }
}