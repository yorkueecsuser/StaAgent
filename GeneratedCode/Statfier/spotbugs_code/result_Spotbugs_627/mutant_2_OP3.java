class Bug1931535 {
  public static void main(String[] args) {
    Boolean active = new Boolean("true");
    Boolean active1 = Boolean.getBoolean("active")? new Boolean(null) : null;

    System.out.println("active:" + active);
    System.out.println("active1:" + active1);

    // Inserting unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement.");
    }
  }

  private static boolean getUnreachableCondition() {
    return false;
  }
}