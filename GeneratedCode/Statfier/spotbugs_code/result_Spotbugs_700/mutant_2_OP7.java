class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);
      // Introduced an unreachable while loop with a dynamic condition
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop will never execute because conditionWhile is always false
      }
    }

    class Inner2 {}

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
      return false;
    }
  }
}