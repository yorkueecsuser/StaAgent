class QuestionableBooleanAssignment {

    public boolean showBug(int value) {
        boolean flag = false;
        int rjxqieha = 10; // Dead store: introducing an unused integer variable
        if (flag = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            flag = value > 0;
        }
        return flag;
    }

    public static void main(String[] args) {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        System.out.println("Result: " + example.showBug(5)); // This will always print true
    }
}