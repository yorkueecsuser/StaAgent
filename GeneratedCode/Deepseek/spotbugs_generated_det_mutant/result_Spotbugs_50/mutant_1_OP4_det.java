class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(showBug(array, 5));
    }

    // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
    public static int showBug(int[] array, int length) {
if (true && true && true && false && false && true && true && false && false && true && false) {boolean tesmzwvv = false;}else{float zwyisyca = -427484926;}

        return array[length];
    
}
}