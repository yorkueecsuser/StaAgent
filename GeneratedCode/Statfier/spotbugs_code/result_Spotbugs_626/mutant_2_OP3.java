class Bug1686615 {
  public static void main(String args[]) {
    String s = "false";
    boolean b = new Boolean(s).booleanValue();
    System.out.println(b);

    // Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  // Method to provide a dynamically determined condition
  private static boolean getCondition() {
    return false;
  }
}