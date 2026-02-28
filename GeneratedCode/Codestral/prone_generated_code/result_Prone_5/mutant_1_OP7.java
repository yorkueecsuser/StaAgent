class ArrayBug {
    public String showBug(int[] arr) {
        boolean condition = false;
        while (condition) {
            // Unreachable code
            System.out.println("This code should never execute");
        }
        return arr.toString();
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}