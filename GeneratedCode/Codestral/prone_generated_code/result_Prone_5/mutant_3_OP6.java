class ArrayBug {
    public String showBug(int[] arr) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("This code will never be executed.");
        }
        return arr.toString();
    }

    private boolean getCondition() {
        return false; // Always returns false, making the loop unreachable
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}