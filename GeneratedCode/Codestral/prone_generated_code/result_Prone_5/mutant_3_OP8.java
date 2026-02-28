class ArrayBug {
    public String showBug(int[] arr) {
        int[] r = arr; // Mutant: Renamed arr to r
        return r.toString();
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] a = {1, 2, 3, 4, 5}; // Mutant: Renamed arr to a
        System.out.println(bug.showBug(a));
    }
}