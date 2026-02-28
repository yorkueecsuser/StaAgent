class Equality {

  public boolean equals(Equality e) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
    return true;
  }

  @Override
  public boolean equals(Object o) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is another unreachable if statement");
    }
    return false;
  }

  private boolean getCondition() {
    return false;
  }

  public static void main(String[] args) {}
}