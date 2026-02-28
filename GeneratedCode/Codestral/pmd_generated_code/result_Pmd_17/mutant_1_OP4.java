class MultipleUnaryOperatorsBug {
    // Method to return a boolean value for the condition
    private boolean getCondition() {
        return false;
    }

    public int showBug() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        // Insert unreachable if-else branch with condition always false
        if (getCondition()) {
            // Code that will never be executed
            int x = 10 / 0; // This will throw an ArithmeticException
        } else {
            // Alternative code
            i = 0;
        }
        return i;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}