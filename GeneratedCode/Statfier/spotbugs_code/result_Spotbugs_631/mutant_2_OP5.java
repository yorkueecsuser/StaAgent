class Bug3086136 {

  int x;

  public void setX(int y) {
    int z;
    this.x = x;
    z = 32;

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case");
        break;
      case 1:
        // This case will always be executed
        System.out.println("This is the reachable case");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}