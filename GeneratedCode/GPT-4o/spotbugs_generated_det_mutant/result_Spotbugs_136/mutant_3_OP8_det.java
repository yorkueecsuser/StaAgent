class QuestionableBooleanAssignment {

    public boolean showBug(int value) {
        boolean mufwpsto = false;
        if (mufwpsto = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            mufwpsto = value > 0;
        }
        return mufwpsto;
    }

    public static void main(String[] args) {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        System.out.println("Result: " + example.showBug(5)); // This will always print true
    }
}