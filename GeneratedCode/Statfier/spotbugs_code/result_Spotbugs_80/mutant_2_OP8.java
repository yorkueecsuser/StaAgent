import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class InstanceLevelSynchronizedMethod {
  private static volatile int counter;

  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public synchronized void methodWithBug() {
    counter++;
  }

  // Mutated code
  private static volatile int a;

  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public synchronized void methodWithBugMutant() {
    a++;
  }
}