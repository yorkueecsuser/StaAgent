class Ideas_2009_05_11 {

  public static void main(String args[]) {

    System.out.printf("Foo bar bar foo\n", 1, 2);
    System.out.printf("Foo {0} bar {1}\n", 1, 2);

    // Mutant code
    String b = "Foo bar bar foo";
    String c = "Foo {0} bar {1}";
    System.out.printf(b + "\n", 1, 2);
    System.out.printf(c + "\n", 1, 2);
  }
}