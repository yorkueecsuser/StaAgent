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
      // This block is logically unreachable because getUnreachableCondition() always returns false
      ReuVeN = 12345;
      MOJOJOJO = 67890;
    }
    return 189234712;
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}