import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class InstanceLevelLockObject {
  private static int counter;
  private final Object lock = new Object();

  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public void methodWithBug() {
    synchronized (lock) {
      // Inserting an unreachable while loop
      boolean conditionWhile = getUnreachableCondition();
      while (conditionWhile) {
        // This loop is unreachable
        System.out.println("This is an unreachable loop");
      }
      counter++;
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the loop unreachable
  }
}