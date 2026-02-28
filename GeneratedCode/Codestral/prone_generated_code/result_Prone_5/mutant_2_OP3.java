class ArrayBug {
    public String showBug(int[] arr) {
        boolean condition = getCondition();
        if (condition) {
            // This if block is unreachable as the method getCondition() always returns false
            System.out.println("This line is unreachable");
        }
        return arr.toString();
    }

    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}