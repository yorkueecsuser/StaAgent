import java.io.FilterInputStream;
import java.io.InputStream;

class MaskedFieldFalsePositive extends FilterInputStream {

  InputStream in;

  protected MaskedFieldFalsePositive(InputStream in) {
    super(in);
    this.in = in;

    // Introduced an unreachable while loop based on a non-final variable
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because conditionWhile is false
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is false at runtime
  }
}