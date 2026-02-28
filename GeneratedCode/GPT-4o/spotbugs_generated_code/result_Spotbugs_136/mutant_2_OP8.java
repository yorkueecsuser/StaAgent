class QuestionableBooleanAssignment {

    public boolean showBug(int x) { // Renamed 'value' to 'x'
        boolean flag = false;
        if (flag = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            flag = x > 0;
        }
        return flag;
    }

    public static void main(String[] args) {
        QuestionableBooleanAssignment y = new QuestionableBooleanAssignment(); // Renamed 'example' to 'y'
        System.out.println("Result: " + y.showBug(5)); // This will always print true
    }
}