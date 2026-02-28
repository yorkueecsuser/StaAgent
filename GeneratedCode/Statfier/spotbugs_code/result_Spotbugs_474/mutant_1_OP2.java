import java.util.Arrays;

class Bug2120789 {
  private final Object[] data;

  public Bug2120789(Object[] a) {
    a = a.clone();
    a = a.clone(); // Mutant: duplicated assignment statement
    // perform other checks.
    this.data = a;
  }

  public Bug2120789(Object[] a, int length) {
    a = Arrays.copyOf(a, length);
    a = Arrays.copyOf(a, length); // Mutant: duplicated assignment statement
    // perform other checks.
    this.data = a;
  }
}