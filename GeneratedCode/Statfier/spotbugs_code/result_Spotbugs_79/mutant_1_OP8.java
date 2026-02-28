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
  private static int xnter; // Renamed 'counter' to 'xnter'
  private final Object klok = new Object(); // Renamed 'lock' to 'klok'

  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public void methodWithBugMutant() {
    synchronized (klok) {
      xnter++;
    }
  }
}