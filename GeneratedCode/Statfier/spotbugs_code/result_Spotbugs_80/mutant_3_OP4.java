import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class InstanceLevelSynchronizedMethod {
  private static volatile int counter;

  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public synchronized void methodWithBug() {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is intended to be unreachable
      counter += 10;
    } else {
      // This block is also intended to be unreachable
      counter -= 5;
    }
    counter++;
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if-else block unreachable
  }
}