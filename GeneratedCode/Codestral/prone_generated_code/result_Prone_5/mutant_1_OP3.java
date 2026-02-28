class ArrayBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug(int[] arr) {
        if (getUnreachableCondition()) {
            // This code will never be executed.
            System.out.println("This is an unreachable block.");
        }
        return arr.toString();
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}