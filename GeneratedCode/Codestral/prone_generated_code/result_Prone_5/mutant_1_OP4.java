class ArrayBug {
    public String showBug(int[] arr) {
        boolean unreachableCondition = falseCondition();
        if (unreachableCondition) {
            // Unreachable mutated code
            return "Unreachable code executed";
        } else {
            return arr.toString();
        }
    }

    private boolean falseCondition() {
        // This method always returns false to make the condition unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}