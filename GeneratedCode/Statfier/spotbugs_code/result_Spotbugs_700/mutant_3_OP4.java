class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);

      // Introduced an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This will never be printed");
      } else {
        System.out.println("This will also never be printed");
      }
    }

    class Inner2 {}

    // Method to provide a dynamic condition
    private boolean getCondition() {
      return false; // This method always returns false, making the if-else unreachable
    }
  }
}