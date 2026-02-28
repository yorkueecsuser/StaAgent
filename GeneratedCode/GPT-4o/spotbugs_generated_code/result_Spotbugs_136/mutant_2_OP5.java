class QuestionableBooleanAssignment {

    public boolean showBug(int value) {
        boolean flag = false;
        if (flag = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            flag = value > 0;
            
            // Unreachable switch statement
            int unreachableSwitchCondition = getUnreachableValue();
            switch (unreachableSwitchCondition) {
                case 1:
                    System.out.println("This is unreachable code and should never execute.");
                    break;
                case 2:
                    System.out.println("This is also unreachable.");
                    break;
                default:
                    System.out.println("Default case, also unreachable.");
            }
        }
        return flag;
    }

    // Method to provide a non-final variable for switch expression
    private int getUnreachableValue() {
        return 0; // This guarantees that none of the cases in the switch will be executed.
    }

    public static void main(String[] args) {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        System.out.println("Result: " + example.showBug(5)); // This will always print true
    }
}