class QuestionableBooleanAssignment {

    public boolean showBug(int value) {
        boolean flag = false;
        int jzqlfdhr = 42; // Dead Store: Randomly generated variable name with a primitive type
        if (flag = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            flag = value > 0;
        }
        return flag;
    }

    public static void main(String[] args) {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        System.out.println("Result: " + example.showBug(5)); // This will always print true
    }
}