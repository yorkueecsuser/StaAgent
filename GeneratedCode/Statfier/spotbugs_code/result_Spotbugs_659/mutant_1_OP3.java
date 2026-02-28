class Ideas_2009_05_11 {

  public static void main(String args[]) {
    // Original code
    System.out.printf("Foo bar bar foo\n", 1, 2);
    System.out.printf("Foo {0} bar {1}\n", 1, 2);

    // Mutant code with unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  // Method to provide a dynamically determined condition
  private static boolean getCondition() {
    return false;
  }
}