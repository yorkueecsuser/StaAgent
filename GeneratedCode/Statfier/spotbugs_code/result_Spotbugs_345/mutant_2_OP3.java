import edu.umd.cs.findbugs.annotations.ExpectWarning;

class AssumeUnsignedBytes {

  @ExpectWarning("INT")
  int find200(byte[] b) {
    for (int i = 0; i < b.length; i++) {
      // Original code
      if (b[i] == 200) return i;
      
      // Mutant code: Inserting an unreachable if branch
      boolean condition = getUnreachableCondition();
      if (condition) {
        // This block is unreachable because getUnreachableCondition() always returns false
        System.out.println("This is an unreachable block");
      }
    }
    return -1;
  }

  // Method to provide a dynamic but always false condition
  private boolean getUnreachableCondition() {
    return false;
  }
}