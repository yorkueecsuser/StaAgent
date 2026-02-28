class MultipleUnaryOperatorsBug {
    // Method to return a constant false value
    private static boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators

        // Insert unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This line should never be executed");
        }

        return i;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}