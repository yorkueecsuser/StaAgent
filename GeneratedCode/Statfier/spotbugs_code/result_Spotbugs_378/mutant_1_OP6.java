class Equality {

  public boolean equals(Equality e) {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
    return true;
  }

  @Override
  public boolean equals(Object o) {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
    return false;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the loop unreachable
  }

  public static void main(String[] args) {}
}