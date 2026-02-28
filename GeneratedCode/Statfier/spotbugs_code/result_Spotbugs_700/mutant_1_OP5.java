class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);
      
      // Introduced unreachable switch statement
      boolean alwaysFalse = getAlwaysFalse();
      switch (alwaysFalse) {
        case true:
          System.out.println("This is unreachable");
          break;
      }
    }

    class Inner2 {}

    // Method to return a constant false value
    private boolean getAlwaysFalse() {
      return false;
    }
  }
}