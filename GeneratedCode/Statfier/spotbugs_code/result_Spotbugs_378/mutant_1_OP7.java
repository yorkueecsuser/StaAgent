class Equality {

  public boolean equals(Equality e) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return true;
  }

  @Override
  public boolean equals(Object o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return false;
  }

  private boolean getCondition() {
    return false;
  }

  public static void main(String[] args) {}
}