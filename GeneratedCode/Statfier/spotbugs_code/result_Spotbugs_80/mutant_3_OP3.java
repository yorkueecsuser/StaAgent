import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class InstanceLevelSynchronizedMethod {
  private static volatile int counter;
  private boolean getUnreachableCondition() {
    return false;
  }

  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public synchronized void methodWithBug() {
    counter++;
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      counter = 0;
    }
  }
}