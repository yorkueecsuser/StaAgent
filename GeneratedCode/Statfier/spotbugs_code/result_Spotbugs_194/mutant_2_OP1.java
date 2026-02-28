class Bug2888644 {
  private static String assignMe = null;

  public void bug1() {
    assignMe = "OK";
    // Dead store mutation
    String abcdefgh = "unusedValue";
  }

  public void bug2() {
    if (assignMe.contains("OK")) {
      System.out.println("OK!");
    }
    assignMe = "OK";
    // Dead store mutation
    int ijklmnop = 42;
  }
}