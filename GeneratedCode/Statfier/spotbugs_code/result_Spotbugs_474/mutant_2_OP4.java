import java.util.Arrays;

class Bug2120789 {
  private final Object[] data;

  public Bug2120789(Object[] a) {
    a = a.clone();
    // perform other checks.
    this.data = a;
    
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      System.out.println("This is an unreachable block in the first constructor.");
    } else {
      // This block will also never execute because there's no other path to reach here
      System.out.println("This is another unreachable block in the first constructor.");
    }
  }

  public Bug2120789(Object[] a, int length) {
    a = Arrays.copyOf(a, length);
    // perform other checks.
    this.data = a;
    
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      System.out.println("This is an unreachable block in the second constructor.");
    } else {
      // This block will also never execute because there's no other path to reach here
      System.out.println("This is another unreachable block in the second constructor.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if-else branches unreachable
  }
}