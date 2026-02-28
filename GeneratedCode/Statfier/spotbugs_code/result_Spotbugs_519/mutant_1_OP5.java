import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTesting {

  /**
   * @param args
   */
  @ExpectWarning(value = "ESync_EMPTY_SYNC", confidence = Confidence.MEDIUM)
  public static void main(String[] args) {
    Object o = new Object();
    synchronized (o) {
      // Inserting an unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be executed because condition is always false
          System.out.println("This is unreachable");
          break;
        case 1:
          // This case will always be executed
          System.out.println("This is reachable");
          break;
      }
    }
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch statement's first case unreachable
    return false;
  }
}