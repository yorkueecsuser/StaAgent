class ArrayLengthBugDemo {

    public static void main(String[] args) {
        try {
            int[] tzbwknby = {1, 2, 3, 4, 5};
            int zmnbosuh = showBug(tzbwknby, 10); // Attempting to access out of bounds length
            System.out.println("Sum: " + zmnbosuh);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static int showBug(int[] array, int length) {
        int sum = 0;
        for (int i = 0; i < length; i++) { // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
            sum += array[i]; // This will throw IndexOutOfBoundsException when i >= array.length
        }
        return sum;
    }
}