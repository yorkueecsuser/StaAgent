import java.util.Arrays;

class Bug2120789 {
  private final Object[] data;

  public Bug2120789(Object[] a) {
    a = a.clone();
    // perform other checks.
    this.data = a;
    
    // Mutant code: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable statement.");
    }
  }

  public Bug2120789(Object[] a, int length) {
    a = Arrays.copyOf(a, length);
    // perform other checks.
    this.data = a;
    
    // Mutant code: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is another unreachable statement.");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}