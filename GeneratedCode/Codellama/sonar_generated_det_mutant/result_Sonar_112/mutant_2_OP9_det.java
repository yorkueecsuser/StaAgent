class ForLoopBug {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        { int i = 0; do { System.out.println(arr[i]); i--; } while (i < arr.length); }
    }
}