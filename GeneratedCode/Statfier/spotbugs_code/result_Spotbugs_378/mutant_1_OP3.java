class Equality {

  public boolean equals(Equality e) {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement.");
    }
    return true;
  }

  @Override
  public boolean equals(Object o) {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is another unreachable statement.");
    }
    return false;
  }

  private boolean getCondition() {
    return false;
  }

  public static void main(String[] args) {}
}