import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class InstanceLevelLockObject {
  private static int counter;
  private final Object lock = new Object();

  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public void methodWithBug() {
    synchronized (lock) {
      counter++;
      
      // Introduced unreachable for loop as per mutation operator
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor is always false
      }
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}