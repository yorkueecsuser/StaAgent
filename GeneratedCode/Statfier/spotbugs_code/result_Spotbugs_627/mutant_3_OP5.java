class Bug1931535 {
  public static void main(String[] args) {
    Boolean active = new Boolean("true");
    Boolean active1 = Boolean.getBoolean("active")? new Boolean(null) : null;

    System.out.println("active:" + active);
    System.out.println("active1:" + active1);

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable code");
        break;
      default:
        System.out.println("Default case");
        break;
    }
  }

  // Method to return a constant false condition
  private static boolean getCondition() {
    return false;
  }
}