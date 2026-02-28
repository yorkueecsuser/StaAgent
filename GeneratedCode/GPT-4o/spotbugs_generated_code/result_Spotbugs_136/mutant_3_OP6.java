class QuestionableBooleanAssignment {

    public boolean showBug(int value) {
        boolean flag = false;
        // Adding unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop");
        }
        
        if (flag = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            flag = value > 0;
        }
        return flag;
    }

    // Method to simulate a condition, ensuring the for loop is unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        System.out.println("Result: " + example.showBug(5)); // This will always print true
    }
}