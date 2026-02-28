import java.util.Arrays;

class Bug2120789 {
  private final Object[] data;

  public Bug2120789(Object[] a) {
    a = a.clone();
    // perform other checks.
    this.data = a;

    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public Bug2120789(Object[] a, int length) {
    a = Arrays.copyOf(a, length);
    // perform other checks.
    this.data = a;

    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}