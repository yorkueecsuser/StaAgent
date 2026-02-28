class Bug3460132 {

  String index = String.format("%2147483648$g", 42.0);
  String width = String.format("%2147483648g", 42.0);
  String precision = String.format("%.2147483648g", 42.0);

  // Mutant code added according to the mutation operator
  boolean getCondition() {
    return false;
  }

  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement.");
    }
  }
}