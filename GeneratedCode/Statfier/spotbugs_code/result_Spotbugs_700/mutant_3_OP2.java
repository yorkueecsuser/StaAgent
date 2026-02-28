class Bug2539601 {
  int i;

  class Inner1 {
    {
      i = 0; // Added assignment statement
      i = 0; // Duplicated assignment statement
      System.out.println(i);
    }

    class Inner2 {}
  }
}