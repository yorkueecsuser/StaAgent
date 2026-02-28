import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class BinarySearch {

  // This one is buggy
  @ExpectWarning("IM")
  public static int binarySearchUsingDivision(int a[], int x) {
    int low = 0;
    int high = a.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      int midValue = a[mid];
      if (x == midValue) return mid;
      if (x < midValue) {
        high = mid - 1;
      } else low = high + 1;
      
      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is unreachable because getCondition() never returns true
          low = 0;
          break;
      }
    }
    return -1;
  }

  // This one is also buggy
  @ExpectWarning("IM")
  public static int binarySearchUsingRightShift(int a[], int x) {
    int low = 0;
    int high = a.length - 1;
    while (low <= high) {
      int mid = (low + high) >> 1;
      int midValue = a[mid];
      if (x == midValue) return mid;
      if (x < midValue) {
        high = mid - 1;
      } else low = high + 1;
      
      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is unreachable because getCondition() never returns true
          high = a.length - 1;
          break;
      }
    }
    return -1;
  }

  // This one is fine
  @NoWarning("IM")
  public static int binarySearchUsingUnsignedRightShift(int a[], int x) {
    int low = 0;
    int high = a.length - 1;
    while (low <= high) {
      int mid = (low + high) >>> 1;
      int midValue = a[mid];
      if (x == midValue) return mid;
      if (x < midValue) {
        high = mid - 1;
      } else low = high + 1;
      
      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is unreachable because getCondition() never returns true
          mid = (low + high) >>> 1;
          break;
      }
    }
    return -1;
  }

  // Helper method to ensure the switch condition is always false
  private static boolean getCondition() {
    return false;
  }
}