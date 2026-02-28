class Bug3460132 {

  String index = String.format("%2147483648$g", 42.0);
  String width = String.format("%2147483648g", 42.0);
  String precision = String.format("%.2147483648g", 42.0);

  // Introduced an unreachable while loop as per the mutation operator description
  boolean conditionWhile = getCondition();
  while (conditionWhile) {
    // This loop is unreachable because getCondition() will always return false
    System.out.println("This loop will never execute.");
  }

  private boolean getCondition() {
    return false;
  }
}