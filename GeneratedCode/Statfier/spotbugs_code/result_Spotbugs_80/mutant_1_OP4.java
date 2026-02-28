import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class InstanceLevelSynchronizedMethod {
  private static volatile int counter;

  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public synchronized void methodWithBug() {
    counter++;

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      counter += 10;
    } else {
      // This block will also never execute for the same reason
      counter -= 5;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if-else block unreachable
  }
}