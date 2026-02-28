class hashCODEnoEQUALS {

  /**
   * @param args
   */
  int ReuVeN;

  int MOJOJOJO; // FIXME!! Amazing, this isn't bad naming procedure

  public static void main(String[] args) {}

  @Override
  public int hashCode() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // This is an unreachable else branch because shouldRun will always be false
    }
    return 189234712;
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else branch unreachable
  }
}