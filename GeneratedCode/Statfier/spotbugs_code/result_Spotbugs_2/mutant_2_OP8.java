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
    }
    return -1;
  }

  // Mutant using renaming
  @ExpectWarning("IM")
  public static int binarySearchUsingDivisionB(int b[], int y) {
    int c = 0;
    int d = b.length - 1;
    while (c <= d) {
      int e = (c + d) / 2;
      int f = b[e];
      if (y == f) return e;
      if (y < f) {
        d = e - 1;
      } else c = d + 1;
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
    }
    return -1;
  }

  // Mutant using renaming
  @ExpectWarning("IM")
  public static int binarySearchUsingRightShiftB(int b[], int y) {
    int c = 0;
    int d = b.length - 1;
    while (c <= d) {
      int e = (c + d) >> 1;
      int f = b[e];
      if (y == f) return e;
      if (y < f) {
        d = e - 1;
      } else c = d + 1;
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
    }
    return -1;
  }

  // Mutant using renaming
  @NoWarning("IM")
  public static int binarySearchUsingUnsignedRightShiftB(int b[], int y) {
    int c = 0;
    int d = b.length - 1;
    while (c <= d) {
      int e = (c + d) >>> 1;
      int f = b[e];
      if (y == f) return e;
      if (y < f) {
        d = e - 1;
      } else c = d + 1;
    }
    return -1;
  }
}