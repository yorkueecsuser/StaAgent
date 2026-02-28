class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        boolean condition = getCondition();
        if (condition) {
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        } else {
            System.out.println("a is not 0"); // Mutant code: This branch is unreachable
        }
    }

    private static boolean getCondition() {
        // This method is used to return a non-final variable to make the condition dynamically determined at runtime
        return false;
    }
}