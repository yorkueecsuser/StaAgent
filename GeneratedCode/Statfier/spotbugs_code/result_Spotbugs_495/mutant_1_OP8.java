import java.io.FilterInputStream;
import java.io.InputStream;

class MaskedFieldFalsePositive extends FilterInputStream {

  InputStream in;

  protected MaskedFieldFalsePositive(InputStream in) {
    super(in);
    this.in = in;
  }

  // Mutant code with renamed variable
  InputStream x;

  protected MaskedFieldFalsePositive(InputStream x) {
    super(x);
    this.x = x;
  }
}