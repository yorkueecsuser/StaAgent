class QuestionableBooleanAssignment {

    public boolean showBug(int value) {
        boolean eeurklbh = false;
        if (eeurklbh = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            eeurklbh = value > 0;
        }
        return eeurklbh;
    }

    public static void main(String[] args) {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        System.out.println("Result: " + example.showBug(5)); // This will always print true
    }
}