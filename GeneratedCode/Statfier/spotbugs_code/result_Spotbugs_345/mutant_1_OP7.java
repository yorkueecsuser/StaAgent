import edu.umd.cs.findbugs.annotations.ExpectWarning;

class AssumeUnsignedBytes {

  @ExpectWarning("INT")
  int find200(byte[] b) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }

    for (int i = 0; i < b.length; i++) 
      if (b[i] == 200) return i;
    return -1;
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false;
  }
}