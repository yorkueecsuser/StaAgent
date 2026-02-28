class Equality {

  public boolean equals(Equality e) {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable block in equals(Equality e)");
    }
    return true;
  }

  @Override
  public boolean equals(Object o) {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable block in equals(Object o)");
    }
    return false;
  }

  private boolean getCondition() {
    return false;
  }

  public static void main(String[] args) {}
}