class EmptyIfStatement {
  public static void main(String[] argv) {
    if (argv.length == 1)
      ; // Original empty if statement
    String qzjxvbnr = "unused"; // Dead store mutant
    System.out.println("Hello, " + argv[0]);
  }
}