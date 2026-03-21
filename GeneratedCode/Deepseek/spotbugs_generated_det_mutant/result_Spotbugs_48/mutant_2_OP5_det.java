import java.util.Arrays;

class ArrayOutOfBounds {
    public int[] showBug(int[] numbers) {
        int[] results = new int[numbers.length + 1];
        int owntwhcr = 0;switch  (owntwhcr) {case 1:int pjxotyxi = 203109962;break;default:short cononhyi = -1869;break;}
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