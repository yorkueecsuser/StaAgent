class QuestionableBooleanAssignment {

    public boolean showBug(int value) {
        boolean xlhniglw = false;
        if (xlhniglw = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            xlhniglw = value > 0;
        }
        return xlhniglw;
    }

    public static void main(String[] args) {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        System.out.println("Result: " + example.showBug(5)); // This will always print true
    }
}