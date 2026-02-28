class QuestionableBooleanAssignment {

    public boolean showBug(int value) {
        boolean flag = false;
        if (flag = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            flag = value > 0;

            // Inserting an unreachable while loop
            boolean unreachableCondition = getUnreachableCondition();
            while (unreachableCondition) {
                System.out.println("This will never be printed.");
            }
        }
        return flag;
    }

    // Method to simulate an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        System.out.println("Result: " + example.showBug(5)); // This will always print true
    }
}