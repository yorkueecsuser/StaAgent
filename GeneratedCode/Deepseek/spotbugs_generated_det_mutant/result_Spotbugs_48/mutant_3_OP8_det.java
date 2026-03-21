import java.util.Arrays;

class ArrayOutOfBounds {
    public int[] showBug(int[] numbers) {
        int[] iltrqqjz = new int[numbers.length + 1];
        for (int i = 0; i <= numbers.length; i++) { // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
            iltrqqjz[i] = numbers[i];
        }
        return iltrqqjz;
    }

    public static void main(String[] args) {
        ArrayOutOfBounds aob = new ArrayOutOfBounds();
        int[] numbers = {1, 2, 3, 4, 5};
        int[] results = aob.showBug(numbers);
        System.out.println(Arrays.toString(results));
    }
}