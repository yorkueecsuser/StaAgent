class ArrayLengthBugDemo {

    public static void main(String[] args) {
        try {
            int[] n = {1, 2, 3, 4, 5}; // Renamed 'numbers' to 'n'
            int sum = showBug(n, 10); // Attempting to access out of bounds length
            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static int showBug(int[] array, int length) {
        int s = 0; // Renamed 'sum' to 's'
        for (int i = 0; i < length; i++) { // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
            s += array[i]; // This will throw IndexOutOfBoundsException when i >= array.length
        }
        return s;
    }
}