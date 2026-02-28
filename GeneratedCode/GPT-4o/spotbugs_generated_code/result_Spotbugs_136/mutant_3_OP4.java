class QuestionableBooleanAssignment {

    public boolean showBug(int value) {
        boolean flag = false;
        if (flag = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            flag = value > 0;
        }
        
        // Inserting an unreachable if-else branch to mutate the code
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block will never be executed
            System.out.println("This is an unreachable code block.");
        } else {
            // This block will also never be executed
            System.out.println("This alternative unreachable code block.");
        }

        return flag;
    }

    // Method to simulate a dynamically determined runtime condition
    private boolean getUnreachableCondition() {
        return false; // Derived at runtime, not a compile-time constant
    }

    public static void main(String[] args) {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        System.out.println("Result: " + example.showBug(5)); // This will always print true
    }
}