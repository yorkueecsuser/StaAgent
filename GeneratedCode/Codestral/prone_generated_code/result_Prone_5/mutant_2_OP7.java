class ArrayBug {
    public String showBug(int[] arr) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Added unreachable while loop
            System.out.println("Unreachable code");
        }
        return arr.toString();
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}