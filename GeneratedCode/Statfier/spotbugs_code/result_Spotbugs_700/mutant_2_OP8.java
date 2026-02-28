class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);
    }

    class Inner2 {}
  }

  // Mutated code
  int a;

  class Inner3 {
    {
      System.out.println(a);
    }

    class Inner4 {}
  }
}