class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);
      
      // Introduced an unreachable switch statement
      boolean alwaysFalse = getAlwaysFalse();
      switch (alwaysFalse) {
        case true:
          System.out.println("This will never be printed");
          break;
      }
    }

    class Inner2 {}

    // Method to provide a dynamically determined false condition
    private boolean getAlwaysFalse() {
      return false;
    }
  }
}