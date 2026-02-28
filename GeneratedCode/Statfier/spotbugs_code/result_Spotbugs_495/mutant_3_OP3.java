import java.io.FilterInputStream;
import java.io.InputStream;

class MaskedFieldFalsePositive extends FilterInputStream {

  InputStream in;

  protected MaskedFieldFalsePositive(InputStream in) {
    super(in);
    this.in = in;
    
    // Introduced unreachable if statement with dynamic condition
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable statement.");
    }
  }

  // Method to provide a dynamic but always false condition
  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if block unreachable
  }
}