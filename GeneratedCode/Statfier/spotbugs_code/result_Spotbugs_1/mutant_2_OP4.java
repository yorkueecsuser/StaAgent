import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class AVERAGE_COMPUTED_USING_DIVISION {

  @ExpectWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  int bug(int a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) / 2;
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable based on the condition
      mid = mid + 1;
    } else {
      // This block is unreachable if getCondition() always returns true
      mid = mid - 1;
    }
    return a[mid];
  }

  @ExpectWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  long bug(long a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) / 2;
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable based on the condition
      mid = mid + 1;
    } else {
      // This block is unreachable if getCondition() always returns true
      mid = mid - 1;
    }
    return a[mid];
  }

  @ExpectWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  Object bug(Object a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) / 2;
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable based on the condition
      mid = mid + 1;
    } else {
      // This block is unreachable if getCondition() always returns true
      mid = mid - 1;
    }
    return a[mid];
  }

  @NoWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  int notBug(int a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) >>> 1;
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable based on the condition
      mid = mid + 1;
    } else {
      // This block is unreachable if getCondition() always returns true
      mid = mid - 1;
    }
    return a[mid];
  }

  private boolean getCondition() {
    // This method can be modified to return different values at runtime
    return true;
  }
}