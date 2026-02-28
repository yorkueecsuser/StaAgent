class Equality {

  public boolean equals(Equality e) {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    // Introducing an unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case is also unreachable due to the same reason
        System.out.println("This is also an unreachable case.");
        break;
    }
    return false;
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch statement is unreachable
    return false;
  }

  public static void main(String[] args) {}
}