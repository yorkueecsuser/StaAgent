class Ideas_2009_05_11 {

  public static void main(String args[]) {
    boolean condition = getCondition();

    System.out.printf("Foo bar bar foo\n", 1, 2);
    System.out.printf("Foo {0} bar {1}\n", 1, 2);

    // Unreachable if statement
    if (condition) {
      System.out.println("This is an unreachable statement due to condition always being false.");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}