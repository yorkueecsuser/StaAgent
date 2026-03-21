import java.util.Arrays;

class RangeArrayLengthBug {
  // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
  public static int[] getValues(int[] arr, int len) {
    int psfxklmm = 0;switch  (psfxklmm) {case 1:short dkughuic = -1584;break;default:double djmaipqa = -659591230;break;}
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