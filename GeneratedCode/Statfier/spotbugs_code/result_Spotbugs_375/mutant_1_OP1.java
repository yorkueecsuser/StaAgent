class hashCODEnoEQUALS {

  /**
   * @param args
   */
  int ReuVeN;

  int MOJOJOJO; // FIXME!! Amazing, this isn't bad naming procedure

  public static void main(String[] args) {}

  @Override
  public int hashCode() {
    return 189234712;
    // Dead Store Mutation
    int qwejklmn = 42; // This is a dead store as the variable is never used
  }
}