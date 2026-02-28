class QuestionableBooleanAssignment {

    public boolean showBug(int value) {
        boolean flag = false;
        if (flag = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            flag = value > 0;
        }
        
        // Inserting unreachable if statement
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }

        return flag;
    }

    // Helper method to simulate unreachable condition
    private boolean getFalseCondition() {
        return false; // Always returns false, making the if condition unreachable
    }

    public static void main(String[] args) {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        System.out.println("Result: " + example.showBug(5)); // This will always print true
    }
}