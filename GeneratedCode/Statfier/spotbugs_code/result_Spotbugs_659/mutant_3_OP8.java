class Ideas_2009_05_11 {

  public static void main(String args[]) {

    System.out.printf("Foo bar bar foo\n", 1, 2);
    System.out.printf("Foo {0} bar {1}\n", 1, 2);

    // Mutated code
    String z = "Foo bar bar foo";
    System.out.printf(z + "\n", 1, 2);
    System.out.printf("Foo {0} bar {1}\n", 1, 2);
  }
}