class BuggyCode {
    public boolean showBug(Object obj) {
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        return obj instanceof String;

        // MUTANT: Unreachable switch statement
        Object type = obj;
        boolean condition = getCondition();

        if (condition) {
            switch (type) {
                case String s:
                    // Unreachable code
                    System.out.println("Unreachable code executed");
                    break;
                default:
                    break;
            }
        }
    }

    private boolean getCondition() {
        return false;
    }
}