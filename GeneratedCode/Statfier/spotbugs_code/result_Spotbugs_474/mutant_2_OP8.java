import java.util.Arrays;

class Bug2120789 {
  private final Object[] data;

  public Bug2120789(Object[] a) {
    a = a.clone();
    // perform other checks.
    this.data = a;
    
    // Mutant code
    Object[] b = a.clone();
    this.data = b;
  }

  public Bug2120789(Object[] a, int length) {
    a = Arrays.copyOf(a, length);
    // perform other checks.
    this.data = a;
    
    // Mutant code
    Object[] c = Arrays.copyOf(a, length);
    this.data = c;
  }
}