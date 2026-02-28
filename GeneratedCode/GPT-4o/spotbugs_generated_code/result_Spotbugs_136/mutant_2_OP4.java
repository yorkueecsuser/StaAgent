class QuestionableBooleanAssignment {

    public boolean showBug(int value) {
        boolean flag = false;
        if (flag = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            flag = value > 0;
        }
        
        // Introducing unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // this block will never be executed due to unreachableCondition
            System.out.println("This is unreachable code.");
        } else {
            // This branch will always execute
            System.out.println("This branch is always executed.");
        }

        return flag;
    }

    // Method to simulate an unreachable condition
    private boolean getUnreachableCondition() {
        return false; // This makes the if-else branch unreachable
    }

    public static void main(String[] args) {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        System.out.println("Result: " + example.showBug(5)); // This will always print true
    }
}