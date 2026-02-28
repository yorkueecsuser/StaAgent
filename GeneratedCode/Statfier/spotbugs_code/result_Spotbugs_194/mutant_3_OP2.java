class Bug2888644 {
  private static String assignMe = null;

  public void bug1() {
    assignMe = "OK";
    assignMe = "OK"; // Mutant: duplicated assignment statement
  }

  public void bug2() {
    if (assignMe.contains("OK")) {
      System.out.println("OK!");
    }
    assignMe = "OK";
    assignMe = "OK"; // Mutant: duplicated assignment statement
  }
}