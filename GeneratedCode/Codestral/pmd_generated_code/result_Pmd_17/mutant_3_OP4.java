class MultipleUnaryOperatorsBug {
    public int showBug() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        boolean unreachable = getCondition();
        if (unreachable) {
            // Unreachable code
            System.out.println("This line should never execute!");
        } else {
            // Normal execution path
            return i;
        }
    }

    private boolean getCondition() {
        // This method always returns false
        return false;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}