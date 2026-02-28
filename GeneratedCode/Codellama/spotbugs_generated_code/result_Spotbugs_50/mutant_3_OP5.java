import java.util.Arrays;

class RangeArrayLengthBug {

  // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
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

  // Unreachable switch statement mutation
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int len = 10;
    int[] result = getValues(arr, len);
    switch(len) {
      case 0:
        System.out.println("This case is unreachable");
        break;
      case 1:
        System.out.println("This case is unreachable");
        break;
      case 2:
        System.out.println("This case is unreachable");
        break;
      case 3:
        System.out.println("This case is unreachable");
        break;
      case 4:
        System.out.println("This case is unreachable");
        break;
      case 5:
        System.out.println("This case is unreachable");
        break;
      case 6:
        System.out.println("This case is unreachable");
        break;
      case 7:
        System.out.println("This case is unreachable");
        break;
      case 8:
        System.out.println("This case is unreachable");
        break;
      case 9:
        System.out.println("This case is unreachable");
        break;
      case 10:
        System.out.println("This case is unreachable");
        break;
      default:
        System.out.println("This default case is unreachable");
        break;
    }
    System.out.println(Arrays.toString(result));
  }
}