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

    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is unreachable");
        break;
      default:
        // Do nothing
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}