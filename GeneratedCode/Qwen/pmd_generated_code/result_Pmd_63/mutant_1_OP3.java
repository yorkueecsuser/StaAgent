class NullAssignmentExample {

    public String showBug(String input) {
        String result = input;
        // big, complex piece of code here
        result = null; // BUG: NullAssignment

        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            result = "This will never be executed";
        }

        // big, complex piece of code here
        return result;
    }

    private boolean getCondition() {
        // Always return false to ensure the if block is unreachable
        return false;
    }

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}