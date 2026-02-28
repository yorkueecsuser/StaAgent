class NullAssignmentExample {

    public String showBug(String input) {
        String result = input;
        // big, complex piece of code here

        // Inserting an unreachable if-else statement
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
        // This method ensures that the condition is dynamically determined at runtime
        return false;
    }

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}