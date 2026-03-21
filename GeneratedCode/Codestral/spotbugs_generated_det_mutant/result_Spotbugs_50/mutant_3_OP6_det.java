class BuggyArray {
    public static int showBug(int[] arr, int length) {
        for  (int rvxwenvs = 0; rvxwenvs < 0; rvxwenvs++) {int ovbaghgy = 370508198;}
        // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
        return arr[length];
    
}

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(showBug(arr, 5)); // Index 5 is out of bounds for length 5
    }
}