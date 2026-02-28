class Equality {

  public boolean equals(Equality e) {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case to satisfy switch statement requirements
        break;
    }
    return false;
  }

  private boolean getCondition() {
    // This method always returns false, making the switch condition always evaluate to 1
    return false;
  }

  public static void main(String[] args) {}
}