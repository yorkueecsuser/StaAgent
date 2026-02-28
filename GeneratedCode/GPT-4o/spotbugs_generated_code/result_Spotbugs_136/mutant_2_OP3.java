class QuestionableBooleanAssignment {

    public boolean showBug(int value) {
        boolean flag = false;
        if (flag = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            flag = value > 0;
        }
        
        // Adding unreachable if statement
        boolean unreachableCondition = calculateUnreachableCondition();
        if (unreachableCondition) {
            // This code is unreachable
            System.out.println("This should never print!");
        }

        return flag;
    }

    // Method to dynamically determine an unreachable condition
    private boolean calculateUnreachableCondition() {
        return false; // Always returns false, making the if statement unreachable
    }

    public static void main(String[] args) {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        System.out.println("Result: " + example.showBug(5)); // This will always print true
    }
}