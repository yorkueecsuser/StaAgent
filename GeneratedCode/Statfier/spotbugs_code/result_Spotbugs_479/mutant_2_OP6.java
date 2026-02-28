class Bug3460132 {

  String index = String.format("%2147483648$g", 42.0);
  String width = String.format("%2147483648g", 42.0);
  String precision = String.format("%.2147483648g", 42.0);

  // Inserting an unreachable for loop
  boolean conditionFor = getCondition();
  for (int i = 0; conditionFor; i++) {
    // This loop is unreachable because conditionFor will always be false
  }

  private boolean getCondition() {
    return false;
  }
}