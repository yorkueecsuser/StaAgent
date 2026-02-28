class QuestionableBooleanAssignment {

    public boolean showBug(int value) {
        boolean flag = false;
        if (flag = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            flag = value > 0;
        }
        
        // Inserted unreachable if-else statement
        boolean unreachableCondition = determineUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This alternative branch is also unreachable.");
        }

        return flag;
    }

    private boolean determineUnreachableCondition() {
        return false; // This ensures the condition is always false
    }

    public static void main(String[] args) {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        System.out.println("Result: " + example.showBug(5)); // This will always print true
    }
}