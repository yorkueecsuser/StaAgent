class QuestionableBooleanAssignment {

    public boolean showBug(int value) {
        boolean flag = false;
        boolean conditionWhile = getCondition(); // Non-final variable used for while loop condition
        if (flag = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT) 
            while (conditionWhile) { // This while loop is unreachable because conditionWhile is false
                // Unreachable code inside the while loop
                System.out.println("This is unreachable.");
            }
            flag = value > 0;
        }
        return flag;
    }

    private boolean getCondition() {
        return false; // This makes the while loop condition always false
    }

    public static void main(String[] args) {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        System.out.println("Result: " + example.showBug(5)); // This will always print true
    }
}