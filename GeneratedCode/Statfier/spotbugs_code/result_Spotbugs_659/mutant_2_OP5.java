class Ideas_2009_05_11 {

  public static void main(String args[]) {
    // Original code
    System.out.printf("Foo bar bar foo\n", 1, 2);
    System.out.printf("Foo {0} bar {1}\n", 1, 2);

    // Added mutant code with an unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("This will also never be printed");
        break;
    }
  }

  // Method to return a dynamically determined false condition
  private static boolean getCondition() {
    return false;
  }
}