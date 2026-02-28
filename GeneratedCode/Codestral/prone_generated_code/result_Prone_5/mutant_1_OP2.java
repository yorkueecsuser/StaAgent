class ArrayBug {
    public String showBug(int[] arr) {
        int firstElement = arr[0]; // addition for mutation
        int firstElement_mutant = arr[0]; // mutated code
        return arr.toString(); // BUG: ArrayToString
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}