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
      
      // Mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable block");
      } else {
        // This block should always execute
        System.out.println("This block should always execute");
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
      
      // Mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable block");
      } else {
        // This block should always execute
        System.out.println("This block should always execute");
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
      
      // Mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable block");
      } else {
        // This block should always execute
        System.out.println("This block should always execute");
      }
    }
    return -1;
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This will ensure the first block is unreachable, but the method itself is not a compile-time constant
  }
}