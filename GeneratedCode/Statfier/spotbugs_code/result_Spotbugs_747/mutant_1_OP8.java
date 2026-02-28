class EmptyIfStatement {
  public static void main(String[] argv) {
    if (argv.length == 1)
      ;
    System.out.println("Hello, " + argv[0]);

    // Mutated code
    String b = "World";
    if (b.length() == 5)
      ;
    System.out.println("Greetings, " + b);
  }
}