class hashCODEnoEQUALS {

  /**
   * @param args
   */
  int ReuVeN;

  int MOJOJOJO; // FIXME!! Amazing, this isn't bad naming procedure

  public static void main(String[] args) {}

  @Override
  public int hashCode() {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is intended to be unreachable
      ReuVeN = 12345;
    } else {
      // This block is also intended to be unreachable
      MOJOJOJO = 67890;
    }
    return 189234712;
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if-else block unreachable
  }
}