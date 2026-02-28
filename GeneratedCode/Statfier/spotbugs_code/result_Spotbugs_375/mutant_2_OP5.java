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

  private boolean getUnreachableCondition() {
    return false;
  }

  private int getUnreachableValue() {
    return 0;
  }

  public void someMethod() {
    boolean condition = getUnreachableCondition();
    if (condition) {
      int value = getUnreachableValue();
      switch (value) {
        case 1:
          System.out.println("This is case 1");
          break;
        case 2:
          System.out.println("This is case 2");
          break;
        default:
          System.out.println("This is the default case");
          break;
      }
    }
  }
}