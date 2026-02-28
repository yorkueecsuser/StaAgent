import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class InstanceLevelLockObject {
  private static int counter;
  private final Object lock = new Object();

  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public void methodWithBug() {
    synchronized (lock) {
      counter++;
      // Mutant code start
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        System.out.println("This is an unreachable if block");
      } else {
        // This block will also never execute because shouldRun is always false
        System.out.println("This is an unreachable else block");
      }
      // Mutant code end
    }
  }

  private boolean getCondition() {
    return false;
  }
}