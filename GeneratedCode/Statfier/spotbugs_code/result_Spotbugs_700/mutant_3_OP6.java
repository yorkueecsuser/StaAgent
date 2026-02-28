class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);

      // Mutant code: Unreachable for loop
      boolean conditionFor = getCondition();
      for (int j = 0; conditionFor; j++) {
        // This loop is unreachable because conditionFor is never set to true
      }
    }

    class Inner2 {}

    // Method to provide a dynamic condition
    private boolean getCondition() {
      return false;
    }
  }
}