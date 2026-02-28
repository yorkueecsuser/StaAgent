class MultipleUnaryOperatorsBug {
    public int showBug() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators

        // Mutant: Unreachable while loop
        while (isUnreachable()) {
            // This code will never be executed
            System.out.println("This is an unreachable loop");
        }

        return i;
    }

    private boolean isUnreachable() {
        return false;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}