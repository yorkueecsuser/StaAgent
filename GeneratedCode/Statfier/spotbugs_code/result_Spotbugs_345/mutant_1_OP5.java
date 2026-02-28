import edu.umd.cs.findbugs.annotations.ExpectWarning;

class AssumeUnsignedBytes {

  @ExpectWarning("INT")
  int find200(byte[] b) {
    for (int i = 0; i < b.length; i++) {
      if (b[i] == 200) return i;
      
      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (getValue(condition)) {
        case 1:
          // Unreachable code
          System.out.println("This is unreachable");
          break;
        default:
          // Default case
          break;
      }
    }
    return -1;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined
  }

  private int getValue(boolean condition) {
    return condition? 1 : 0; // This method ensures the switch value is dynamically determined
  }
}