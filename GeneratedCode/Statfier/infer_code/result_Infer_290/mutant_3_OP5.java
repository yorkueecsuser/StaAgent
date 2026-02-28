class T {
  int x;

  void f() {
    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse? 0 : 1) {
      case 0:
        // This case will never be reached because alwaysFalse is false
        System.out.println("This is unreachable");
        break;
      case 1:
        // This case will always be executed
        System.out.println("This is reachable");
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}