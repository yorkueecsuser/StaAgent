class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);
      // Dead Store Mutation
      int abcdefgh = 42; // Unused variable declaration
    }

    class Inner2 {}
  }
}