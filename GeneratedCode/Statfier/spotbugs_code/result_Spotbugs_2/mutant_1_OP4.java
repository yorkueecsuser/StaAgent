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
      
      // Mutant: Inserting an unreachable if-else statement
      boolean shouldRun = false; // This variable ensures the condition is not a compile-time constant
      if (shouldRun) {
        System.out.println("This will never be printed");
      } else {
        System.out.println("This will also never be printed");
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
      
      // Mutant: Inserting an unreachable if-else statement
      boolean shouldRun = getCondition(); // This method ensures the condition is not a compile-time constant
      if (shouldRun) {
        System.out.println("This will never be printed");
      } else {
        System.out.println("This will also never be printed");
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
      
      // Mutant: Inserting an unreachable if-else statement
      boolean shouldRun = getAnotherCondition(); // This method ensures the condition is not a compile-time constant
      if (shouldRun) {
        System.out.println("This will never be printed");
      } else {
        System.out.println("This will also never be printed");
      }
    }
    return -1;
  }

  // Helper methods to ensure dynamic conditions
  private static boolean getCondition() {
    return false;
  }

  private static boolean getAnotherCondition() {
    return false;
  }
}