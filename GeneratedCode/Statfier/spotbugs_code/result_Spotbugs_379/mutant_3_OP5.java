class Parent {
  @Override
  public boolean equals(Object o) {
    // Introducing an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable because alwaysFalse is always false
        System.out.println("This will never be printed");
        break;
      default:
        // Default case is also unreachable due to the same reason
        System.out.println("This will also never be printed");
        break;
    }
    return false;
  }

  private boolean getAlwaysFalse() {
    return false;
  }

  public void blargh() {}
}