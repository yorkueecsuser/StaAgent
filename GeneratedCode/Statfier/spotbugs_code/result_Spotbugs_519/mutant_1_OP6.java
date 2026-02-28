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
      // Introduced an unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() returns false
      }
    }
  }

  private static boolean getCondition() {
    return false;
  }
}