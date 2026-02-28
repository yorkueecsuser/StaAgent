class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);
      // Introduced an unreachable if statement with a dynamic condition
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable statement");
      }
    }

    class Inner2 {}

    // Method to provide a dynamic condition
    private boolean getCondition() {
      return false;
    }
  }
}