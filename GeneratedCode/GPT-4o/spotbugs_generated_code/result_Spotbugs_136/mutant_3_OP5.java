class QuestionableBooleanAssignment {

    public boolean showBug(int value) {
        boolean flag = false;
        if (flag = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            flag = value > 0;

            // Mutation: Unreachable switch statement
            int unreachableValue = getUnreachableValue(); // Ensure dynamically determined at runtime
            switch (unreachableValue) {
                case 1:
                    System.out.println("This is unreachable because unreachableValue will never be 1.");
                    break;
                // other cases can be added if needed
                default:
                    // Default doesn't need to be reachable
                    break;
            }
        }
        return flag;
    }

    // Helper method to ensure runtime evaluation
    private int getUnreachableValue() {
        return 0; // This makes the switch default case execute
    }

    public static void main(String[] args) {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        System.out.println("Result: " + example.showBug(5)); // This will always print true
    }
}