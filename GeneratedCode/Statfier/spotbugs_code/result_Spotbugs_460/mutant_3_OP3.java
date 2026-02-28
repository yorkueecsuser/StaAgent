class CloneStringArray {
  public static void main(String args[]) {
    String[] copy = args.clone();
    System.out.println(copy.toString());

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}