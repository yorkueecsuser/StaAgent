class ArrayBug {
    public String showBug(int[] arr) {
        int[] r = arr; // Mutant: Renamed 'arr' to 'r'
        return r.toString();
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] ar = {1, 2, 3, 4, 5}; // Mutant: Renamed 'arr' to 'ar'
        System.out.println(bug.showBug(ar));
    }
}