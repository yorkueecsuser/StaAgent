import edu.umd.cs.findbugs.annotations.ExpectWarning;

class AssumeUnsignedBytes {

  @ExpectWarning("INT")
  int find200(byte[] b) {
    for (int i = 0; i < b.length; i++) {
      if (b[i] == 200) return i;
      
      // Mutant: Inserting an unreachable if-else branch
      boolean condition = getCondition();
      if (condition) {
        // This block will never execute because condition is always false
        System.out.println("This is an unreachable block");
      } else {
        // Alternative code that also won't execute due to the same condition
        System.out.println("This is another unreachable block");
      }
    }
    return -1;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}