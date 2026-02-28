import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class InstanceLevelLockObject {
  private static int counter;
  private final Object lock = new Object();

  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public void methodWithBug() {
    synchronized (lock) {
      boolean condition = getCondition();
      if (condition) {
        // This is an unreachable if statement because getCondition() always returns false
        counter += 10; // Unique code to ensure mutant uniqueness
      }
      counter++;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime but always returns false
  }
}