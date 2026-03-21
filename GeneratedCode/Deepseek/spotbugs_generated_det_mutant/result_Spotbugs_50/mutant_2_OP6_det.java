class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(showBug(array, 5));
    }

    // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
    public static int showBug(int[] array, int length) {
for  (int jyzcbmbr = 0; jyzcbmbr < 0; jyzcbmbr++) {long vfjmkxrp = -479801869;}

        return array[length];
    
}
}