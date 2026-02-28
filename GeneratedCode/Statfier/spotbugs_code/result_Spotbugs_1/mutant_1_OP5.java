import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class AVERAGE_COMPUTED_USING_DIVISION {

  @ExpectWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  int bug(int a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) / 2;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        mid = anyLow;
        break;
      case 1:
        // This is the reachable case
        break;
    }
    return a[mid];
  }

  @ExpectWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  long bug(long a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) / 2;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        mid = anyLow;
        break;
      case 1:
        // This is the reachable case
        break;
    }
    return a[mid];
  }

  @ExpectWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  Object bug(Object a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) / 2;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        mid = anyLow;
        break;
      case 1:
        // This is the reachable case
        break;
    }
    return a[mid];
  }

  @NoWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  int notBug(int a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) >>> 1;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        mid = anyLow;
        break;
      case 1:
        // This is the reachable case
        break;
    }
    return a[mid];
  }

  private boolean getCondition() {
    // This method always returns false, making the switch case 0 unreachable
    return false;
  }
}