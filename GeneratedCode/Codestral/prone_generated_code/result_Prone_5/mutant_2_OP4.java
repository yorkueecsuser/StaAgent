class ArrayBug {
    public String showBug(int[] arr) {
        if (getUnreachableCondition()) {
            return "Unreachable code";
        } else {
            return arr.toString();
        }
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}