import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class InstanceLevelSynchronizedMethod {
  private static volatile int counter;

  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public synchronized void methodWithBug() {
    counter++;

    // Introduced unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      counter = 0;
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if block unreachable
  }
}