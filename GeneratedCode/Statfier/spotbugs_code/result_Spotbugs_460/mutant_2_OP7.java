class CloneStringArray {
  public static void main(String args[]) {
    String[] copy = args.clone();
    System.out.println(copy.toString());

    // Introduced unreachable while loop as per mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
      System.out.println("This will never be printed");
    }
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}