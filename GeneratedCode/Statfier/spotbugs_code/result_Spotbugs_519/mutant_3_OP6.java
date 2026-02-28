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
      // Unreachable for loop mutant
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is intended to be unreachable
      }
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}