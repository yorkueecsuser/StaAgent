class Ideas_2010_05_04 {

  volatile int x;

  volatile long y;

  void bad() {
    x++;
    y++;
    x--;
    y--;
    x -= 2;
    y -= 2;

    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        x += 10; // This case is unreachable
        break;
      default:
        y += 10; // This case is also unreachable
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false; // This method always returns false, making the switch statement unreachable
  }
}