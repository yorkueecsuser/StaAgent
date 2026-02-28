class Bug2888644 {
  private static String assignMe = null;

  public void bug1() {
    assignMe = "OK";
  }

  public void bug2() {
    if (assignMe.contains("OK")) {
      System.out.println("OK!");
    }
    assignMe = "OK";

    // Introduced unreachable if statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This is unreachable!");
    }
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}