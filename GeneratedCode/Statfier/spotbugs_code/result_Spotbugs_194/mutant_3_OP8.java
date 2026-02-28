class Bug2888644 {
  private static String assignMe = null;
  private static String x = null; // Mutant variable

  public void bug1() {
    assignMe = "OK";
    x = "OK"; // Mutant assignment
  }

  public void bug2() {
    if (assignMe.contains("OK")) {
      System.out.println("OK!");
    }
    assignMe = "OK";
    x = "OK"; // Mutant assignment
  }
}