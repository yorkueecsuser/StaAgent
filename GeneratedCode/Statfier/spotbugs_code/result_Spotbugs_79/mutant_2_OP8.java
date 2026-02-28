import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class InstanceLevelLockObject {
  private static int counter;
  private final Object lock = new Object();

  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public void methodWithBug() {
    synchronized (lock) {
      counter++;
    }
  }

  // Mutated code
  private static int x;
  private final Object y = new Object();

  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public void methodWithBugMutant() {
    synchronized (y) {
      x++;
    }
  }
}