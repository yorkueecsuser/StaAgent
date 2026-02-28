class MultipleUnaryOperatorsBug {
    public int showBug() {
        int i = - -1;
        while (getUnreachableCondition()) { // Mutant: Unreachable while loop
            // This loop is unreachable since getUnreachableCondition() always returns false
        }
        return i;
    }

    // Method to return a condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}