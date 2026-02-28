import java.util.Arrays;

class Bug2120789 {
  private final Object[] data;

  public Bug2120789(Object[] a) {
    a = a.clone();
    // perform other checks.
    this.data = a;
    String qzjfnxrb = "unusedVariable"; // Dead Store
  }

  public Bug2120789(Object[] a, int length) {
    a = Arrays.copyOf(a, length);
    // perform other checks.
    this.data = a;
    int vbnrhtyq = 42; // Dead Store
  }
}