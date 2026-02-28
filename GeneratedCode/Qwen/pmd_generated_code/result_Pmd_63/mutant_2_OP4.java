class NullAssignmentExample {

    public String showBug(String input) {
        String result = input;
        // big, complex piece of code here

        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            result = "This will never be executed";
        } else {
            result = "This will also never be executed";
        }

        result = null; // BUG: NullAssignment
        // big, complex piece of code here
        return result;
    }

    private boolean getCondition() {
        // This method ensures that the condition is always false at runtime
        return false;
    }

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}