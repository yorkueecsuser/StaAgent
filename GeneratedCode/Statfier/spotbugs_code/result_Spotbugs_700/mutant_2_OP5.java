class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);

      // Introduced an unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be reached because condition is always false
          System.out.println("This is unreachable");
          break;
        case 1:
          // This case will always be executed
          System.out.println("This is reachable");
          break;
      }
    }

    class Inner2 {}

    // Method to provide a dynamic condition
    private boolean getCondition() {
      return false;
    }
  }
}