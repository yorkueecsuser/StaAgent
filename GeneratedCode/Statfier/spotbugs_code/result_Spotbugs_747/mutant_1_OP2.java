class EmptyIfStatement {
  public static void main(String[] argv) {
    if (argv.length == 1)
      ;
    System.out.println("Hello, " + argv[0]);
    // Duplicate of the print statement
    System.out.println("Greetings, " + argv[0] + "!");
  }
}