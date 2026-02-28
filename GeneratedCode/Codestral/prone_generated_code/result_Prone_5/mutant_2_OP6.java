class ArrayBug {
    public String showBug(int[] arr) {
        boolean condition = false;
        for (int i = 0; condition; i++) { // Unreachable for loop
            // This loop will never execute
        }
        return arr.toString(); // BUG: ArrayToString
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}