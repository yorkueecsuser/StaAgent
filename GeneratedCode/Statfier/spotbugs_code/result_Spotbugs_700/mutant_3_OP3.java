class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);
      // Mutant code start
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement");
      }
      // Mutant code end
    }

    class Inner2 {}

    // Method to provide a dynamic condition
    private boolean getCondition() {
      return false; // This will ensure the condition is always false at runtime, making the if block unreachable
    }
  }
}