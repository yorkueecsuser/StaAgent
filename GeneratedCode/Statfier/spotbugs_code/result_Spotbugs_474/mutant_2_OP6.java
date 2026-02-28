import java.util.Arrays;

class Bug2120789 {
  private final Object[] data;

  public Bug2120789(Object[] a) {
    a = a.clone();
    // perform other checks.
    this.data = a;
    
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  public Bug2120789(Object[] a, int length) {
    a = Arrays.copyOf(a, length);
    // perform other checks.
    this.data = a;
    
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  private boolean getCondition() {
    return false;
  }
}