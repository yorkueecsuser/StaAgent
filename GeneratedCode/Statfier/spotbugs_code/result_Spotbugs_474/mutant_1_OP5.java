import java.util.Arrays;

class Bug2120789 {
  private final Object[] data;

  public Bug2120789(Object[] a) {
    a = a.clone();
    // perform other checks.
    this.data = a;

    // Introduced unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable because alwaysFalse is never true
        System.out.println("This will never be printed");
        break;
    }
  }

  public Bug2120789(Object[] a, int length) {
    a = Arrays.copyOf(a, length);
    // perform other checks.
    this.data = a;

    // Introduced unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable because alwaysFalse is never true
        System.out.println("This will never be printed");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}