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
      // Inserting an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will never run because shouldRun is always false.");
      } else {
        System.out.println("This will also never run because shouldRun is always false.");
      }
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}