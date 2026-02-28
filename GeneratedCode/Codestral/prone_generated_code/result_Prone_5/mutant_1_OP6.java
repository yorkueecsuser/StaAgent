class ArrayBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(int[] arr) {
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This line should not be executed.");
        }
        return arr.toString();
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}