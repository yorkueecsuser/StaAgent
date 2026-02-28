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
      // Mutant code starts here
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        System.out.println("This should never be printed");
      } else {
        // Alternative code that should also never run
        System.out.println("This should also never be printed");
      }
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}