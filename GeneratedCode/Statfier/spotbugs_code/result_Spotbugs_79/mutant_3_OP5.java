import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class InstanceLevelLockObject {
  private static int counter;
  private final Object lock = new Object();

  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public void methodWithBug() {
    synchronized (lock) {
      counter++;
      
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("This is an unreachable case.");
          break;
        case 1:
          // This case is always executed
          System.out.println("This is the reachable case.");
          break;
      }
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the first case in the switch unreachable
    return false;
  }
}