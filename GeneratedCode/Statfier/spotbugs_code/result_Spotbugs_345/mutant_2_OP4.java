import edu.umd.cs.findbugs.annotations.ExpectWarning;

class AssumeUnsignedBytes {

  @ExpectWarning("INT")
  int find200(byte[] b) {
    for (int i = 0; i < b.length; i++) {
      if (b[i] == 200) return i;
      
      // Inserted unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is intended to be unreachable
        System.out.println("This should never print");
      } else {
        // This block is also intended to be unreachable
        System.out.println("This should never print either");
      }
    }
    return -1;
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}