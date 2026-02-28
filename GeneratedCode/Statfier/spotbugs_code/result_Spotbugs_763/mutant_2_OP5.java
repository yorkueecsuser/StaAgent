class CallSystemExit {

  @Override
  public boolean equals(Object o) {
    if (o instanceof CallSystemExit) return true;
    System.exit(1);
    return false;

    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case will never be executed because alwaysFalse is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case will also never be executed for the same reason
        System.out.println("This is also an unreachable case.");
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}