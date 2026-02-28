class NullAssignmentExample {

    public String showBug(String input) {
        String result = input;
        // big, complex piece of code here
        result = null; // BUG: NullAssignment

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will always return false
            result = "Unreachable";
        }

        // big, complex piece of code here
        return result;
    }

    private boolean getCondition() {
        // This method ensures the condition is dynamically determined at runtime and always returns false
        return false;
    }

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}