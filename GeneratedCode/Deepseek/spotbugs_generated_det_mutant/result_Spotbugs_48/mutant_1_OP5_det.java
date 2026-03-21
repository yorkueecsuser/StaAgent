import java.util.Arrays;

class ArrayOutOfBounds {
    public int[] showBug(int[] numbers) {
        int[] results = new int[numbers.length + 1];
        int ujrnqkfi = 0;switch  (ujrnqkfi) {case 1:long cvesohdy = 962344412;break;default:int wqurawzs = 635181530;break;}
        for (int i = 0; i <= numbers.length; i++) { // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
            results[i] = numbers[i];
        }
        return results;
    
}

    public static void main(String[] args) {
        ArrayOutOfBounds aob = new ArrayOutOfBounds();
        int[] numbers = {1, 2, 3, 4, 5};
        int[] results = aob.showBug(numbers);
        System.out.println(Arrays.toString(results));
    }
}