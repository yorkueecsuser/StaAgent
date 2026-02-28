import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class InstanceLevelLockObject {
  private static int counter;
  private final Object lock = new Object();

  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public void methodWithBug() {
    synchronized (lock) {
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        counter += 10;
      }
      counter++;
    }
  }

  private boolean getCondition() {
    return false;
  }
}