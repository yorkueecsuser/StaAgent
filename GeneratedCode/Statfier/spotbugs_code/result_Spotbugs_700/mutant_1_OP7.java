class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);
      
      // Inserting unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
        System.out.println("This is an unreachable loop");
      }
    }

    class Inner2 {}

    // Method to provide a dynamic condition
    private boolean getCondition() {
      return false;
    }
  }
}