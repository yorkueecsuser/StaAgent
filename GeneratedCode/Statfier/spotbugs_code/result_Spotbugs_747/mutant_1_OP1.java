class EmptyIfStatement {
  public static void main(String[] argv) {
    if (argv.length == 1)
      ;
    String abcdefgh = "unusedVariable"; // Dead store
    System.out.println("Hello, " + argv[0]);
  }
}