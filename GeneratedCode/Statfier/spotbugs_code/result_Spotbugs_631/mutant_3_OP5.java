class Bug3086136 {

  int x;

  public void setX(int y) {
    int z;
    this.x = x;
    z = 32;

    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case will never be executed because alwaysFalse is always false
        z = 42;
        break;
      default:
        // Default case will also never be executed
        z = 52;
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}