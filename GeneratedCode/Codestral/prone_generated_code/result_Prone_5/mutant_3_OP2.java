class ArrayBug {
    public String showBug(int[] arr) {
        int[] arrDuplicate = arr; // Mutant: Duplication
        return arrDuplicate.toString();
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}