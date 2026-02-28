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
      // This is an unreachable else block due to the nature of getCondition()
    }
    return 189234712;
  }

  private boolean getCondition() {
    // This method returns false, making the else block unreachable
    return false;
  }
}