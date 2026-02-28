import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class InstanceLevelLockObject {
  private static int counter;
  private final Object lock = new Object();

  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public void methodWithBug() {
    synchronized (lock) {
      // Inserting an unreachable if statement
      boolean condition = getUnreachableCondition();
      if (condition) {
        // This block is unreachable because getUnreachableCondition() always returns false
        counter += 10; // Unique code to ensure mutant uniqueness
      }
      counter++;
    }
  }

  // Method to provide a dynamically determined false condition
  private boolean getUnreachableCondition() {
    return false;
  }
}