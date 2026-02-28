class ArrayBug {
    private boolean getUnreachableCondition() {
        // This method always returns false to make the following if-else branch unreachable
        return false;
    }

    public String showBug(int[] arr) {
        if (getUnreachableCondition()) {
            // This block of code is unreachable, but for the sake of the mutation, it is included
            System.out.println("Unreachable block");
        } else {
            // Original code
            return arr.toString();
        }
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}