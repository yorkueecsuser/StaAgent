import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class AVERAGE_COMPUTED_USING_DIVISION {

  @ExpectWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  int bug(int a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) / 2;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return a[mid];
  }

  @ExpectWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  long bug(long a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) / 2;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return a[mid];
  }

  @ExpectWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  Object bug(Object a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) / 2;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return a[mid];
  }

  @NoWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  int notBug(int a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) >>> 1;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return a[mid];
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}