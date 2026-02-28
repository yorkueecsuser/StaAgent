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
      // This is a reachable block
      System.out.println("This is a reachable block");
    } else {
      // This is an unreachable block due to condition always being false
      System.out.println("This is an unreachable block");
    }
  }

  @ExpectWarning("SR_NOT_CHECKED")
  void bug2(BufferedInputStream any, long anyLong) throws IOException {
    any.skip(anyLong);
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      System.out.println("This is a reachable block");
    } else {
      // This is an unreachable block due to condition always being false
      System.out.println("This is an unreachable block");
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
      // This is a reachable block
      System.out.println("This is a reachable block");
    } else {
      // This is an unreachable block due to condition always being false
      System.out.println("This is an unreachable block");
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the else block unreachable
    return false;
  }
}