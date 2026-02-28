class Bug2539601 {
  int i;

  class Inner1 {
    {
      i = 0; // Introduced assignment statement
      System.out.println(i);
      i = 0; // Duplicated assignment statement
    }

    class Inner2 {}
  }
}