import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SelfLocalOperation {

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  int f(int x, int y) {
    if (x < x) x = y ^ y;
    if (x == x) x = y ^ y;
    boolean b = x == x;
    if (x!= x) y = x | x;
    if (x >= x) x = y & y;
    
    // Mutant: Unreachable if statement
    boolean condition = falseCondition();
    if (condition) {
      x = x + 1; // This line is unreachable
    }
    
    return x;
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  long f(long x, long y) {
    if (x < x) x = y ^ y;
    if (x!= x) y = x | x;
    if (x >= x) x = y & y;
    
    // Mutant: Unreachable if statement
    boolean condition = falseCondition();
    if (condition) {
      y = y * 2; // This line is unreachable
    }
    
    return x;
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  boolean e(Object x, Object y) {
    return x.equals(x);
    
    // Mutant: Unreachable if statement
    boolean condition = falseCondition();
    if (condition) {
      return false; // This line is unreachable
    }
  }

  @ExpectWarning("SA_LOCAL_SELF_COMPARISON")
  int c(Integer x, Integer y) {
    return x.compareTo(x);
    
    // Mutant: Unreachable if statement
    boolean condition = falseCondition();
    if (condition) {
      return -1; // This line is unreachable
    }
  }
  
  // Helper method to provide a dynamically determined false condition
  private boolean falseCondition() {
    return false;
  }
}