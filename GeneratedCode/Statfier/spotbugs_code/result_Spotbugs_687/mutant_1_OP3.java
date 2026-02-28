import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.BufferedInputStream;
import java.io.IOException;

class SR_NOT_CHECKED {

  @ExpectWarning("SR_NOT_CHECKED")
  void bug1(BufferedInputStream any, long anyLong) throws IOException {
    any.skip(anyLong);
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("SR_NOT_CHECKED")
  void bug2(BufferedInputStream any, long anyLong) throws IOException {
    any.skip(anyLong);
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement");
    }
  }

  @NoWarning("SR_NOT_CHECKED")
  long notBug(BufferedInputStream any, long anyLong) throws IOException {
    return any.skip(anyLong);
  }

  @NoWarning("SR_NOT_CHECKED")
  void notBug2(BufferedInputStream any, long anyLong) throws IOException {
    while (anyLong > 0) {
      anyLong -= any.skip(anyLong);
    }
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Yet another unreachable statement");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}