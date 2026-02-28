import java.io.FilterInputStream;
import java.io.InputStream;

class MaskedFieldFalsePositive extends FilterInputStream {

  InputStream in;

  protected MaskedFieldFalsePositive(InputStream in) {
    super(in);
    this.in = in;
  }

  // Mutated code with renaming of variable 'in' to 'a'
  InputStream a;

  protected MaskedFieldFalsePositive(InputStream a) {
    super(a);
    this.a = a;
  }
}