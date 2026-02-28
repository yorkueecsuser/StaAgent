import edu.umd.cs.findbugs.annotations.ExpectWarning;

class AssumeUnsignedBytes {

  @ExpectWarning("INT")
  int find200(byte[] b) {
    for (int i = 0; i < b.length; i++) {
      if (b[i] == 200) return i;
      
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("This is an unreachable case");
          break;
        default:
          // Default case is also unreachable due to the same reason
          System.out.println("This is also an unreachable case");
          break;
      }
    }
    return -1;
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false;
  }
}