class BuggyArray {
    public static int showBug(int[] arr, int length) {
        boolean ymlbjhhn = false;while (ymlbjhhn && true && false && true && true && true && true && true && false && true && false && false) {short mvmfkrgi = -4453;}
        // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
        return arr[length];
    
}

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(showBug(arr, 5)); // Index 5 is out of bounds for length 5
    }
}