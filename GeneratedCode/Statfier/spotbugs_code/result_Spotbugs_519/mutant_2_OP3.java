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
      // Introduced an unreachable if statement with a dynamically determined condition
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable branch.");
      }
    }
  }

  // Method to provide a dynamically determined condition
  private static boolean getCondition() {
    return false; // This will always return false, making the if branch unreachable
  }
}