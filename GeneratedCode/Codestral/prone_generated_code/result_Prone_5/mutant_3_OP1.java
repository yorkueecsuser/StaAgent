class ArrayBug {
    public String showBug(int[] arr) {
        // Dead Store mutation
        int deadStoreVariable = 0; // Added unused variable
        return arr.toString();
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}