class Finalize {
  @Override
  protected void finalize() {
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because getCondition() always returns false
      System.out.println("This is an unreachable if statement.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}