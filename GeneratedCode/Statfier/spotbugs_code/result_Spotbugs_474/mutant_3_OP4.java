import java.util.Arrays;

class Bug2120789 {
  private final Object[] data;

  public Bug2120789(Object[] a) {
    a = a.clone();
    // perform other checks.
    this.data = a;
    
    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will also never execute because getCondition() always returns false
      System.out.println("This is an unreachable else block.");
    }
  }

  public Bug2120789(Object[] a, int length) {
    a = Arrays.copyOf(a, length);
    // perform other checks.
    this.data = a;
    
    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is another unreachable if block.");
    } else {
      // This block will also never execute because getCondition() always returns false
      System.out.println("This is another unreachable else block.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}