class ArrayBug {
    public String showBug(int[] arr) {
        int firstElement = arr[0];
        return arr.toString(); // BUG: ArrayToString
        arr[0] = firstElement; // Mutant: Duplicated assignment statement
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}