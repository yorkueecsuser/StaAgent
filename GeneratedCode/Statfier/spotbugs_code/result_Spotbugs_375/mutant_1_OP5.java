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
  }

  // Added mutant code for Unreachable switch statement
  private boolean getUnreachableCondition() {
    return false;
  }

  public void someMethod() {
    boolean condition = getUnreachableCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case is unreachable because condition is always false
        System.out.println("This will never be printed");
        break;
      default:
        // Default case to ensure the switch is not empty
        System.out.println("Default case");
        break;
    }
  }
}