class Equality {

  public boolean equals(Equality e) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return true;
  }

  @Override
  public boolean equals(Object o) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return false;
  }

  private boolean getCondition() {
    return false;
  }

  public static void main(String[] args) {}
}