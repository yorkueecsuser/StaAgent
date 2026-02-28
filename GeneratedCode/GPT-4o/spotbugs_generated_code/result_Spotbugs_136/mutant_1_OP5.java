class QuestionableBooleanAssignment {

    public boolean showBug(int value) {
        boolean flag = false;
        if (flag = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            flag = value > 0;
            
            // Unreachable switch statement
            boolean unreachable = false; // Use a non-final variable
            if (unreachable) {
                switch (value) {
                    case 999: // This case is unreachable due to the if condition
                        System.out.println("This will never be printed.");
                        break;
                    default:
                        System.out.println("Default case.");
                        break;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        System.out.println("Result: " + example.showBug(5)); // This will always print true
    }
}