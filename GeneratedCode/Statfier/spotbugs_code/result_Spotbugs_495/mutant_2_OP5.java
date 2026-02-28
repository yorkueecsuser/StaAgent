import java.io.FilterInputStream;
import java.io.InputStream;

class MaskedFieldFalsePositive extends FilterInputStream {

  InputStream in;

  protected MaskedFieldFalsePositive(InputStream in) {
    super(in);
    this.in = in;

    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case will never be reached because getCondition() does not return true
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case will also not be reached due to the nature of the condition
        System.out.println("This is also an unreachable case.");
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch statement is unreachable
    return false;
  }
}