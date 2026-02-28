import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2013_11_06 {

  int flags;

  @NoWarning("SA_FIELD_SELF_COMPARISON")
  public boolean test() {
    boolean result = false;
    result |= flags == (short) flags;
    result |= flags == (char) flags;
    result |= flags == (byte) flags;
    
    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      result |= flags == (int) flags; // This line is logically redundant but keeps the structure
    } else {
      // Unreachable code
      result |= flags == (long) flags;
    }
    
    return result;
  }

  @ExpectWarning("SA_FIELD_SELF_COMPARISON")
  public boolean testTP() {
    boolean result = false;
    result |= flags == flags;
    
    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      result |= flags == (int) flags; // This line is logically redundant but keeps the structure
    } else {
      // Unreachable code
      result |= flags == (long) flags;
    }
    
    return result;
  }

  @NoWarning("SA_FIELD_SELF_COMPUTATION")
  public int testUpdate() {
    return flags ^ (short) flags;
  }

  @ExpectWarning("SA_FIELD_SELF_COMPUTATION")
  public int testUpdateTP() {
    return flags ^ flags;
  }

  @NoWarning("SA")
  public boolean test(int x) {
    boolean result = false;

    result |= x == (short) x;
    result |= x == (char) x;
    result |= x == (byte) x;
    
    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      result |= x == (int) x; // This line is logically redundant but keeps the structure
    } else {
      // Unreachable code
      result |= x == (long) x;
    }
    
    return result;
  }

  @ExpectWarning("SA")
  public boolean testTP(int x) {
    boolean result = false;

    result |= x == x;
    
    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      result |= x == (int) x; // This line is logically redundant but keeps the structure
    } else {
      // Unreachable code
      result |= x == (long) x;
    }
    
    return result;
  }

  @NoWarning("SA")
  public boolean test(long x) {
    boolean result = false;

    result |= x == (int) x;
    result |= x == (short) x;
    result |= x == (char) x;
    result |= x == (byte) x;
    
    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      result |= x == (long) x; // This line is logically redundant but keeps the structure
    } else {
      // Unreachable code
      result |= x == (double) x;
    }
    
    return result;
  }

  @ExpectWarning("SA")
  public boolean testTP(long x) {
    return x == x;
  }

  @NoWarning("SA")
  public void test2(int x) {
    assert x == (short) x;
    assert x == (char) x;
    assert x == (byte) x;
    
    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      assert x == (int) x; // This line is logically redundant but keeps the structure
    } else {
      // Unreachable code
      assert x == (long) x;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, making the else block unreachable
  }
}