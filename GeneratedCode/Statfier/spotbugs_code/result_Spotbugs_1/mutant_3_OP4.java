import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class AVERAGE_COMPUTED_USING_DIVISION {

  @ExpectWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  int bug(int a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) / 2;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intentionally left empty to maintain the unreachable if-else statement
    } else {
      // This block is also intentionally left empty
    }
    return a[mid];
  }

  @ExpectWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  long bug(long a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) / 2;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intentionally left empty to maintain the unreachable if-else statement
    } else {
      // This block is also intentionally left empty
    }
    return a[mid];
  }

  @ExpectWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  Object bug(Object a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) / 2;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intentionally left empty to maintain the unreachable if-else statement
    } else {
      // This block is also intentionally left empty
    }
    return a[mid];
  }

  @NoWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  int notBug(int a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) >>> 1;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intentionally left empty to maintain the unreachable if-else statement
    } else {
      // This block is also intentionally left empty
    }
    return a[mid];
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else branches unreachable
    return false;
  }
}