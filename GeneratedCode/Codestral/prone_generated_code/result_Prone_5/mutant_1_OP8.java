class ArrayBug {
    public String showBug(int[] arr) {
        int[] a = arr; // Mutant: Renaming variable arr to a
        return a.toString();
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}