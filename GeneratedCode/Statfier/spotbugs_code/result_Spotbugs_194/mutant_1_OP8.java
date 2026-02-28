class Bug2888644 {
  private static String assignMe = null;
  private static String b = null; // Mutated variable

  public void bug1() {
    assignMe = "OK";
    b = "OK"; // Mutated usage
  }

  public void bug2() {
    if (assignMe.contains("OK")) {
      System.out.println("OK!");
    }
    assignMe = "OK";
    b = "OK"; // Mutated usage
  }
}