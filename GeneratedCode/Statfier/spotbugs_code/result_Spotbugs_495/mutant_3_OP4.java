import java.io.FilterInputStream;
import java.io.InputStream;

class MaskedFieldFalsePositive extends FilterInputStream {

  InputStream in;

  protected MaskedFieldFalsePositive(InputStream in) {
    super(in);
    this.in = in;

    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
      System.out.println("This is the reachable block.");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This is the unreachable block.");
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the else block is unreachable
    return false;
  }
}