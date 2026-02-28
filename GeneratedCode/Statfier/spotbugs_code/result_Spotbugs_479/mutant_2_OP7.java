class Bug3460132 {

  String index = String.format("%2147483648$g", 42.0);
  String width = String.format("%2147483648g", 42.0);
  String precision = String.format("%.2147483648g", 42.0);

  // Inserting an unreachable while loop
  boolean conditionWhile = getCondition();
  while (conditionWhile) {
    // This loop is unreachable because getCondition() will return false
    System.out.println("This loop is unreachable");
  }

  private boolean getCondition() {
    return false;
  }
}