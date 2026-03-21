import java.util.Arrays;

class ArrayOutOfBounds {
    public int[] showBug(int[] numbers) {
        int[] results = new int[numbers.length + 1];
        boolean oxnfuqzu = false;while (oxnfuqzu && false && false && false && true && true && false && true && false && true && false && false) {double fqbvmmdt = 641189194;}
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