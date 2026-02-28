import java.io.FilterInputStream;
import java.io.InputStream;

class MaskedFieldFalsePositive extends FilterInputStream {

  InputStream in;

  protected MaskedFieldFalsePositive(InputStream in) {
    super(in);
    this.in = in;

    // Introduced an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case will never be executed
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}