import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.BufferedInputStream;
import java.io.IOException;

class SR_NOT_CHECKED {

  @ExpectWarning("SR_NOT_CHECKED")
  void bug1(BufferedInputStream any, long anyLong) throws IOException {
    any.skip(anyLong);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in bug1");
    }
  }

  @ExpectWarning("SR_NOT_CHECKED")
  void bug2(BufferedInputStream any, long anyLong) throws IOException {
    any.skip(anyLong);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in bug2");
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in notBug2");
    }
  }

  private boolean getCondition() {
    // This method returns false, making the if condition always false at runtime
    return false;
  }
}