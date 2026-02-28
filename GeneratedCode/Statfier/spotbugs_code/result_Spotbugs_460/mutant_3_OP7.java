class CloneStringArray {
  public static void main(String args[]) {
    String[] copy = args.clone();
    System.out.println(copy.toString());

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
      System.out.println("This loop is unreachable");
    }
  }

  private static boolean getCondition() {
    // This method always returns false, making the while loop unreachable
    return false;
  }
}