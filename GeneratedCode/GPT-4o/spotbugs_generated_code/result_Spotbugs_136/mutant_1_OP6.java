class QuestionableBooleanAssignment {

    public boolean showBug(int value) {
        boolean flag = false;
        if (flag = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            flag = value > 0;
        }
        
        // Mutation: Inserting an unreachable for loop
        int unreachableLoopCondition = 0; // This variable ensures the condition is not a compile-time constant
        for (int i = 0; unreachableLoopCondition > 0; i++) {
            System.out.println("This is an unreachable loop");
        }
        
        return flag;
    }

    public static void main(String[] args) {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        System.out.println("Result: " + example.showBug(5)); // This will always print true
    }
}