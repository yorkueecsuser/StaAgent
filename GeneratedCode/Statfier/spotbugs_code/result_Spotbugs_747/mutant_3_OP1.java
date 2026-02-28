class EmptyIfStatement {
  public static void main(String[] argv) {
    if (argv.length == 1)
      ;
    String qwerasdf = "unused"; // Dead store mutation
    System.out.println("Hello, " + argv[0]);
  }
}