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

// Renaming Mutant 1: Renaming the variable 'len' to 'l'
class RangeArrayLengthBug {
  // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
  public static int[] getValues(int[] arr, int l) {
    int[] result = new int[l];
    for (int i = 0; i < l; i++) {
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

// Renaming Mutant 2: Renaming the variable 'arr' to 'a'
class RangeArrayLengthBug {
  // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
  public static int[] getValues(int[] a, int len) {
    int[] result = new int[len];
    for (int i = 0; i < len; i++) {
      result[i] = a[i];
    }
    return result;
  }

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int[] result = getValues(a, 10);
    System.out.println(Arrays.toString(result));
  }
}

// Renaming Mutant 3: Renaming the variable'result' to 'r'
class RangeArrayLengthBug {
  // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
  public static int[] getValues(int[] arr, int len) {
    int[] r = new int[len];
    for (int i = 0; i < len; i++) {
      r[i] = arr[i];
    }
    return r;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int[] r = getValues(arr, 10);
    System.out.println(Arrays.toString(r));
  }
}