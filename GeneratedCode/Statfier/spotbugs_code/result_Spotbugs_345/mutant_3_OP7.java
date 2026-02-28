import edu.umd.cs.findbugs.annotations.ExpectWarning;

class AssumeUnsignedBytes {

  @ExpectWarning("INT")
  int find200(byte[] b) {
    // Introduced an unreachable while loop with a dynamic condition
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because conditionWhile is false
    }

    for (int i = 0; i < b.length; i++) if (b[i] == 200) return i;
    return -1;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}