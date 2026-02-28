class Bug1931535 {
  public static void main(String[] args) {
    Boolean active = new Boolean("true");
    Boolean active1 = Boolean.getBoolean("active")? new Boolean(null) : null;

    System.out.println("active:" + active);
    System.out.println("active1:" + active1);

    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is the reachable part of the if-else statement.");
    } else {
      System.out.println("This is the unreachable part of the if-else statement.");
    }
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}