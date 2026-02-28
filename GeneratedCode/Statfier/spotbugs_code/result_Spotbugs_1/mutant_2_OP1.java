import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class AVERAGE_COMPUTED_USING_DIVISION {

  @ExpectWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  int bug(int a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) / 2;
    String qzjfnvht = "unused"; // Dead store
    return a[mid];
  }

  @ExpectWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  long bug(long a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) / 2;
    int xwvbnrht = 42; // Dead store
    return a[mid];
  }

  @ExpectWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  Object bug(Object a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) / 2;
    double jkldfght = 3.14; // Dead store
    return a[mid];
  }

  @NoWarning("IM_AVERAGE_COMPUTATION_COULD_OVERFLOW")
  int notBug(int a[], int anyLow, int anyHigh) {
    int mid = (anyLow + anyHigh) >>> 1;
    boolean rhtyujmn = true; // Dead store
    return a[mid];
  }
}