class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);
      // Hypothetical assignment statement
      i = 10;
      // Duplicate of the hypothetical assignment statement
      i = 10;
    }

    class Inner2 {}
  }
}