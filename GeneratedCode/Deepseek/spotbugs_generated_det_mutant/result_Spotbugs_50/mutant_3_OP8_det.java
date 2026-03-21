class Main {
    public static void main(String[] args) {
        int[] swbrectm = {1, 2, 3};
        System.out.println(showBug(swbrectm, 5));
    }

    // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
    public static int showBug(int[] array, int length) {
        return array[length];
    }
}