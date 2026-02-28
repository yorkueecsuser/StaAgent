import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class InstanceLevelSynchronizedMethod {
  private static volatile int counter;

  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public synchronized void methodWithBug() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
      counter--; // Some arbitrary operation to ensure the loop is not empty
    }

    counter++;
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}