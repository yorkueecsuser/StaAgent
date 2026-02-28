import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class InstanceLevelSynchronizedMethod {
  private static volatile int counter;

  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public synchronized void methodWithBug() {
    counter++;

    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}