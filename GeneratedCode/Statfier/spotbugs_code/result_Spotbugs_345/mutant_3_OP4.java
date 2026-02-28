import edu.umd.cs.findbugs.annotations.ExpectWarning;

class AssumeUnsignedBytes {

  @ExpectWarning("INT")
  int find200(byte[] b) {
    for (int i = 0; i < b.length; i++) {
      // Original code
      if (b[i] == 200) return i;
      
      // Mutated code: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() will always return false
        System.out.println("This is an unreachable block");
      } else {
        // Alternative code that will also never execute due to the same reason
        System.out.println("This is another unreachable block");
      }
    }
    return -1;
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}