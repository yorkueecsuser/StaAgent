class MultipleUnaryOperatorsBug {
    public int showBug() {
        int i = - -1;
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never execute.");
        } else {
            // Original code
            return i;
        }
        // This line is added to handle the case where the unreachable condition is true
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}