class Equality {

  public boolean equals(Equality e) {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    return false;
  }

  public static void main(String[] args) {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}