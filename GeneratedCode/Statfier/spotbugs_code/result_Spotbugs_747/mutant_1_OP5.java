class EmptyIfStatement {
  public static void main(String[] argv) {
    if (argv.length == 1)
      ;

    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
    }

    System.out.println("Hello, " + argv[0]);
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}