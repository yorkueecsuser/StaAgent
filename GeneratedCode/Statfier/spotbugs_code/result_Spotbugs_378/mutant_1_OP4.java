class Equality {

  public boolean equals(Equality e) {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      // This is the unreachable code due to the condition always being false
      System.out.println("This is unreachable code.");
    }
    return false;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime but always returns false
  }

  public static void main(String[] args) {}
}