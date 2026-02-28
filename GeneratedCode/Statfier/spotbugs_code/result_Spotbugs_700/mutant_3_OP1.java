class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);
      // Dead store mutation
      String abcdefgh = "unusedVariable";
    }

    class Inner2 {}
  }
}