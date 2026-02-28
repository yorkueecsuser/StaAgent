class CloneStringArray {
  public static void main(String args[]) {
    String[] copy = args.clone();
    System.out.println(copy.toString());

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
      System.out.println("This is reachable.");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This is unreachable.");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}