class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);
      // Dead Store mutation
      int abcdefgh = 42; // Unused variable declaration
    }

    class Inner2 {}
  }
}