import java.util.Arrays;

class RangeArrayLengthBug {
  // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
  public static int[] getValues(int[] arr, int len) {
    int[] result = new int[len];
    for (int i = 0; i < len; i++) {
      result[i] = arr[i];
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int[] result = getValues(arr, 10);
    System.out.println(Arrays.toString(result));
  }
}

// Mutation Operator: Unreachable if statement
// Mutation Operator description: Inserting unreachable if branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.

// Unreachable if statement example:
if (false) {
  // code
}

// Applying unreachable if statement mutation operator to the given Java code:

import java.util.Arrays;

class RangeArrayLengthBug {
  // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
  public static int[] getValues(int[] arr, int len) {
    int[] result = new int[len];
    for (int i = 0; i < len; i++) {
      result[i] = arr[i];
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int[] result = getValues(arr, 10);
    System.out.println(Arrays.toString(result));

    // Unreachable if statement mutation:
    if (false) {
      // code
    }
  }
}

// The mutated code now has an unreachable if statement, which will never be executed.